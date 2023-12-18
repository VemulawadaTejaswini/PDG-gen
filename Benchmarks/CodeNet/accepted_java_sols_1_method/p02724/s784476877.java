import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int haveyen = sc.nextInt();
		int money500 = haveyen / 500;
		int happy500 = money500 * 1000 ;
		int money5 = (haveyen - (money500 * 500)) / 5;
		int happy5 = money5 * 5;

		System.out.println(happy500 + happy5);
	}
}