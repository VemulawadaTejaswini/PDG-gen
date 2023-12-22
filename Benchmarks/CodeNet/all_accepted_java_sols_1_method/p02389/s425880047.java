import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		System.out.println(a*b +" "+ 2*(a+b));
	}

}
