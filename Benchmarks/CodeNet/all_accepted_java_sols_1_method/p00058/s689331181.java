import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double[] a = new double[8];
			for(int i=0;i<8;i++){
				a[i]=cin.nextDouble();
			}
			double dx1=a[2]-a[0];
			double dy1=a[3]-a[1];
			double dx2=a[2+4]-a[0+4];
			double dy2=a[3+4]-a[1+4];
			double n = dx1*dx2+dy1*dy2;
			double EPS=1e-8;
//			System.out.println(n);
			if(0.0<n+EPS&&n-EPS<0.0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			
		}
	}

}