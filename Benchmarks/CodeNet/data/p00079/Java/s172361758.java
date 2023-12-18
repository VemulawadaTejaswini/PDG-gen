import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		double[][] pos = new double[20][2];
		int n = 0;
		while(stdIn.hasNext()){
			String[] a = stdIn.next().split(",");
			pos[n][0] = Double.parseDouble(a[0]);
			pos[n++][1] = Double.parseDouble(a[1]);
		}
		double sum = 0;
		for(int i=0;i<n-1;i++){
			sum += (pos[i][0]-pos[i+1][0])*(pos[i][1]+pos[i+1][1]);
		}
		sum += (pos[n-1][0]-pos[0][0])*(pos[n-1][1]-pos[0][1]);
		sum = sum/2;
		if(sum<0){
			sum *= -1;
		}
		System.out.printf("%.6f\n",sum);
	}
}