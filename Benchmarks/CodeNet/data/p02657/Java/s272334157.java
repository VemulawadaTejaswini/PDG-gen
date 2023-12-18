import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int h1 = Integer.parseInt(str);
		String str2 = sc.next();
		int h2 = Integer.parseInt(str2);
		int g=h1*h2;
        sc.close();
        System.out.println(g);

	}

}