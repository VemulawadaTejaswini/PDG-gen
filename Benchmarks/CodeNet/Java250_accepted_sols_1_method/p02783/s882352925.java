import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int num = h / a;
		int amari = h % a;
		System.out.println(amari == 0 ? num : num + 1);
	}


}

