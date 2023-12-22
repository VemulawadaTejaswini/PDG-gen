import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int second = sc.nextInt();

		System.out.println((second / 3600) + ":" + ((second%3600)/60) + ":" + (second % 60));

		sc.close();

	}

}
