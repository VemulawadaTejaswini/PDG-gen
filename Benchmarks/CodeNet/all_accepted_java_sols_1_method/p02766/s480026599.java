import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		int k = 0;
		ArrayList<Integer> anser = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();

		while(n>=k) {
			anser.add(n%k);
			n=n/k;
		}

		if(n<k) {
			anser.add(n);
		}
		System.out.println(anser.size());
	}

}
