import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int f=scan.nextInt();
		int ab=Math.abs(a-b);
		int ac=Math.abs(a-c);
		int ad=Math.abs(a-d);
		int ae=Math.abs(a-e);
		int bc=Math.abs(b-c);
		int bd=Math.abs(b-d);
		int be=Math.abs(b-e);
		int cd=Math.abs(c-d);
		int ce=Math.abs(c-e);
		int de=Math.abs(d-e);
		if(ab<=f&&ac<=f&&ad<=f&&ae<=f&&bc<=f&&bd<=f&&be<=f&&cd<=f&&ce<=f&&de<=f) {
			System.out.println("Yay!");
		}
		else
		{
			System.out.println(":(");
		}
	}
}