
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==b) {
			System.out.println(a+b);
		}
		else {
			int c=Math.max(a, b);
			System.out.println(c+c-1);
		}
	}
}