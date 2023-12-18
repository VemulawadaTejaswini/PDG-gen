import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//a,bを入力し、商、余り、浮動小数点を出力する
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int syou=a/b;
		int amari=a%b;
		double syosu=(double)a/(double)b;
		BigDecimal bd=new BigDecimal(syosu);
		BigDecimal syosu2=bd.setScale(6,BigDecimal.ROUND_DOWN);
		System.out.println(syou+" "+amari+" "+syosu2);
	}

}

