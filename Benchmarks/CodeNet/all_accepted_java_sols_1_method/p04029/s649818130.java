import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int humanNum = sc.nextInt();
		int count = 0;

		for(int num = 1; num <= humanNum; num++) {
			count += num;
		}

		System.out.println(count);
	}
}