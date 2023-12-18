import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6] ;
		double x=0,y=0;
		while(scan.hasNext()){
			for(int i = 0; i < 6;i++){
				a[i] = scan.nextInt();
			}
			double d = a[0]*a[4] - a[1]*a[3];
			x = (double)(a[4]*a[2] - a[1]*a[5]);
			y = (double)(-a[3]*a[2] + a[0]*a[5]);
			if(x != 0){
				x /= d;
			}
			if(y != 0){
				y /= d;
			}
			System.out.printf("%.3f %.3f\n",x,y);

		}
		
	}
}