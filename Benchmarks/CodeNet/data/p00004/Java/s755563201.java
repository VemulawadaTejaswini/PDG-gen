import java.util.Scanner;
import java.math.BigDecimal;
class Main{
	static Scanner sc;
	static int a[];
	static double x,y;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(true){
			a=new int[6];
			for(int i=0;i<6;i++){
				a[i]=sc.nextInt();
			}
			x=Math.round((a[2]*a[4]-a[1]*a[5])/((a[0]*a[4]-a[1]*a[3])));
			y=Math.round((a[3]*a[2]-a[0]*a[5])/((a[3]*a[1]-a[0]*a[4])));
			System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP));
		}
	}
} 