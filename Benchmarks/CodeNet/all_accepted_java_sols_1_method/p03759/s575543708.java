import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = b-a;
		int e = c-b;
		System.out.println(d == e ? "YES":"NO");
	}
}