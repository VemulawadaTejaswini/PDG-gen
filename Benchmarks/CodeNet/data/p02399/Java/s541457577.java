import java.util.*;

public class Main{
	public static void main(String[] args){
		int a, b, d, r;
		double f;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		//整数a,bを格納する

		if(1<=a && a <=Math.pow(10, 9)){
			d = a/b;
			//除算（余無）
			r = a%b;
			//除算（余有）
			f = (double)a/b;
			//除算（浮動小数点）
			System.out.print(d+" "+r+" ");
			System.out.printf("%f\n",(double)f);
		}
	}
}