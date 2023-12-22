import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int x = scan.nextInt();

		int left;
		int right;
		if(x - k + 1 >= -1000000)
			left = x - k + 1;
		else
			left = -1000000;

		if(1000000 >= x + k - 1)
			right = x + k - 1;
		else
			right = 1000000;

		int i;
		for(i = left; i <= right; i++)
			System.out.println(i);
	}
}