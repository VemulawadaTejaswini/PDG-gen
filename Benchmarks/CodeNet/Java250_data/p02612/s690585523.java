import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = Integer.parseInt(sc.nextLine());
		int amari = input % 1000;
		int result = amari == 0 ? 0 : 1000 - amari;
	    System.out.println(result);
	}
}
