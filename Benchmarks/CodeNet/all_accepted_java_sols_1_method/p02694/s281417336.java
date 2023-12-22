import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long start =100;
		int count=0;
		while (true) {
			count ++;
			start = (long) (start*1.01);
			if (start >=X) {
				break;
			}
		}
		System.out.println(count);
	}
}
