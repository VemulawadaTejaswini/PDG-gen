import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);
		
		int n  = scanner.nextInt();
		double P1=0;
		double P2=0;
		double P3=0;
		double Pi=0;
		
		double[] x; 
		x = new double[n];//ベクトルx
		
		double[] y; 
		y = new double[n];//ベクトルy
		
           for(int i=0;i<n;i++){
        	   double X  = scanner.nextDouble();
			x[i]=X;
		}
           for(int i=0;i<n;i++){
        	   double Y  = scanner.nextDouble();
			y[i]=Y;
		}
           for(int i=0;i<n;i++){
        	   P1=P1+Math.abs(x[i]-y[i]);
        	   P2=P2+Math.pow(Math.abs(x[i]-y[i]),2);
        	   P3=P3+Math.pow(Math.abs(x[i]-y[i]),3);
        	   Pi=Math.max(Pi,Math.abs(x[i]-y[i]));
           }
           System.out.println(P1);
		   System.out.println(Math.sqrt(P2));
		   System.out.println(Math.cbrt(P3));
		   System.out.println(Pi);


		scanner.close();
	}
}

