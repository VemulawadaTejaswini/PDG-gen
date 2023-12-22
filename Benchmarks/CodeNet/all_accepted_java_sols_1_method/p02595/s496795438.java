import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int D=scan.nextInt();
		int X[]=new int[N];
		int Y[]=new int[N];
		int count =0;
		double distance[]=new double[N];
		double resultX[]=new double[N];
		double resultY[]=new double[N];
		double result[]=new double[N];
		for(int i=0;i<N;i++) {
				X[i]=scan.nextInt();
				Y[i]=scan.nextInt();
				resultX[i]=Math.pow(X[i],2);
				resultY[i]=Math.pow(Y[i],2);
				result[i]=resultX[i]+resultY[i];
		}
		
	
		for(int i=0;i<N;i++) {
			distance[i]=Math.sqrt(result[i]);
		}
		
		for(int i=0;i<N;i++) {
		if(D>=distance[i]) {
			count+=1;
		}
		}
		System.out.println(count);
	}
}
