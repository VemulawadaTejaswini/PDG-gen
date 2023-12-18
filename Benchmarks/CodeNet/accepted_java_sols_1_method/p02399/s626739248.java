import java.util.*;
class Main{
	public static void main(String[] args){
		
		int a,b,d,r;//int型変数定義
		double f;//不動小数点用変数定義
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(1 <= a && a <= Math.pow(10,9)){//条件 1<=a,b<=10の９乗
			d = a / b;//a÷bあまりなし
			r = a % b;//a÷bあまり
			f = (double)a/b;//a÷b小数表示
			System.out.printf(d + " " + r + " " + "%f",(double)f);
		}
		
	
	}
	
}