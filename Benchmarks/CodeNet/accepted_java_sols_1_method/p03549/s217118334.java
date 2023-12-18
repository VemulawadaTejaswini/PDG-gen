import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();//100
		int m = sc.nextInt();//5
		int a,b,x,y;
		double num = Math.pow(2, m);//32
		int ans;
		
		a=n-m;//95
		x=a*100;//9500
		y=m*1900;//9500
		ans=(int) ((x+y)*num);
		
		System.out.println(ans);
	}
}
