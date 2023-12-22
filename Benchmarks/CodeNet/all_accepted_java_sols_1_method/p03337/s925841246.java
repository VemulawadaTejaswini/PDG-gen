import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c1=a+b;
		int c2=a*b;
		int c3=a-b;
		int max=c1;
		if(max<c2) {
			max=c2;
		}
		if(max<c3) {
			max=c3;
		}
		System.out.println(max);
	}
}