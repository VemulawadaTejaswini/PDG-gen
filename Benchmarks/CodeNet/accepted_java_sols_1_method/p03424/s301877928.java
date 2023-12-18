import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        sc.nextLine();
		String str = sc.nextLine();
		sc.close();
		System.out.println((str.indexOf("Y") != -1)?"Four":"Three");
	}
}