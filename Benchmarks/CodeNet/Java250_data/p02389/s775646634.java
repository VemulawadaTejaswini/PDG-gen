import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a*b);
		System.out.print(" ");
		System.out.println(a*2+b*2);
	}
}