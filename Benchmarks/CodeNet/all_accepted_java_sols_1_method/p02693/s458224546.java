import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer k = sc.nextInt();
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();

		String result = "NG";
		for(int i = 1; k * i <= b; i++) {
			if(k * i >= a) {
				result = "OK";
			}
		}
		System.out.println(result);
	}
}