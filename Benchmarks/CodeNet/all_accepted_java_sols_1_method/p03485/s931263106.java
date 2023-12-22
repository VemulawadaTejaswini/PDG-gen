import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double ans=(double)(a+b)/2+0.5;
		System.out.println((int)ans);
	}
}
