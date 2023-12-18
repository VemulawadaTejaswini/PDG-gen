import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int S=scanner.nextInt();
		int h=S/3600;
		int H=S%3600;
		int m=H/60;
		int M=H%60;
		int s=M/1;
		System.out.print(h);
		System.out.print(":");
		System.out.print(m);
		System.out.print(":");
		System.out.print(s);
	}

}

