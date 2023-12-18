import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner  in= new Scanner(System.in);
		double[] a = new double [6];
		while(true){
			try{
				for(int i = 0;i < 6;i++){
					a[i] = in.nextDouble();
				}
				double x = (a[2]*a[4]-a[5]*a[1])/(a[0]*a[4]-a[3]*a[1]);
				double y = (a[2]-a[0]*x)/a[1];
				double x2 = x*10000;
				double y2 = y*10000;
				if(x2 % 10 >= 5){
		            x2 = x2 + 1;
		        }
		        if(y2 % 10 >= 5){
		            y2 = y2 + 1;
		        }
		        x = x2 / 10000.0;
		        y = y2 / 10000.0;
		        if(x == 0.0){
		        	x = 0.0;
		        }if(y == 0.0){
		        	y = 0.0;
		        }
		        System.out.printf("%1.3f %1.3f\n",x,y);
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}