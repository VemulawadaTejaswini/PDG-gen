import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count = 0;
		long money = sc.nextLong();
		long curent = 100l;
		while (curent < money) {
			++count;
			curent += curent / 100l;
		}
		System.out.println(count);
	}
}
