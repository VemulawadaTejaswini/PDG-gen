import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double x,h,ans,tri;
		
		while(true){
			x = scan.nextDouble();
			h = scan.nextDouble();
			if(x==0&&h==0){
				break;
			}
			
			tri = Math.sqrt(x/2*x/2+h*h);
			
			ans = x*x + 4*(tri*x/2);
			System.out.printf("%.6f\n",ans);
		}
	}
}