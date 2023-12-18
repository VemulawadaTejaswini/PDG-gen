import java.util.*;

public class Main{
	public static void main(String[] args){
		int a, b, d, r;
		float f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		//整数a,bを格納する
		d = a/b;
		//除算（余無）
		r = a%b;
		//除算（余有）
		f = (float)a/b;
		//除算（浮動小数点）
		System.out.println(d+" "+r+" "+f);
	}
}