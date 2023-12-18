import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.printf("%d %d %.5f"+System.getProperty("line.separator"),a/b,a%b,(double)a/b);
	}
}