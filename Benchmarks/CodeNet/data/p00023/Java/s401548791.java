import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N =cin.nextInt();
		for(;N--!=0;){
			En A =new En(cin.nextDouble(),cin.nextDouble(),cin.nextDouble());
			En B =new En(cin.nextDouble(),cin.nextDouble(),cin.nextDouble());
			boolean f=false;
			if(A.r<B.r){
				En C = A.clone();
				A = B;
				B=C;
				f=true;
			}
			double distance=dist(A,B);
			
			if(distance>A.r){
				// 外
				if(A.r+B.r>distance){
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}
				
			}
			else{
				int x = 2;
				if(f){
					x*=-1;
				}
				if(distance+B.r<A.r){
					System.out.println(x);
				}
				else{
					System.out.println(-x);
				}
			}
		}

	}
	static double dist(En A,En B){
		double x = (A.x-B.x)*(A.x-B.x);
		double y = (A.y-B.y)*(A.y-B.y);
		
		return Math.sqrt(x+y);
	}
}
class En{
	double x,y,r;
	En(double a,double b,double c){
		x=a;y=b;r=c;
	}
	protected En clone(){
		En c=new En(this.x,this.y,this.r);
		return c;
	}
}