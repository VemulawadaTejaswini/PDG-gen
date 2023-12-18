import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double[] x=new double[4];
		double[] y=new double[4];
		for(int i=0; i<n; i++){
			for(int j=0; j<4; j++){
				x[j]=sc.nextDouble();
				y[j]=sc.nextDouble();
			}
			if((y[1]-y[0])/(x[1]-x[0])==(y[3]-y[2])/(x[3]-x[2])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		}
	}
}