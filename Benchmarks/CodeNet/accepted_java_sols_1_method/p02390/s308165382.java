import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
				int b,c,d,e,f;
				b=a/3600;
				e=a%3600;
				c=e/60;
				d=e%60;
		System.out.println(""+b+":"+c+":"+d+"");
	}
}