import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int max = w;
		if(h > w)
			max = h;

		int n = sc.nextInt();
		sc.close();
		if(n % max == 0)
		System.out.println(n / max);
		else
			System.out.println(n / max + 1);


	}

}
