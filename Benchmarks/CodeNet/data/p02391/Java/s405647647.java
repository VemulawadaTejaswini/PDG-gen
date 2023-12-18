import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		String c="";
		if(a>b)c=">";
		if(a<b)c="<";
		if(a==b)c="==";
		System.out.println("a "+c+" b");
	}
}