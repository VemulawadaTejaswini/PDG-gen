import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0,num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			total += i+1;
		}
		System.out.println(total);
	}
}
