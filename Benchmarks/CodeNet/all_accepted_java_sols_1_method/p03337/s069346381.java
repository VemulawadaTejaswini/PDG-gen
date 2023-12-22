import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dmp = Math.max(a+b, a-b);
		System.out.println(Math.max(dmp,a*b));
	}
}
