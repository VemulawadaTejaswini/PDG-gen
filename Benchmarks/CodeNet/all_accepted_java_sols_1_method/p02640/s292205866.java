import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count	= sc.nextInt();
		int legs	= sc.nextInt();
		int hind	= legs-(count*2);
		System.out.println(hind>=0&&hind%2==0&&hind/2<=count?"Yes":"No");
	}
}