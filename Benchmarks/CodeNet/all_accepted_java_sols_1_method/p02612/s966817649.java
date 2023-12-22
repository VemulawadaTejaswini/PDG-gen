import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//test
		Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

		System.out.println(((N % 1000) == 0) ? 0 : 1000 - (N % 1000));
	}

}
