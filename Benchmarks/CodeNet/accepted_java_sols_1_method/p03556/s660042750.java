import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		for(int i = 1 ; i <= Math.sqrt(n) + 1 ; i++) {
			if(i * i > n)
				break;
			max = i * i;
		}

		sc.close();
		System.out.println(max);

	}
}

