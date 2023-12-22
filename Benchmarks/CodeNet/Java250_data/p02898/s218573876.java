import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = 0;

		for(int i = 0; i < n; i++) {
			if(k <= sc.nextInt()) c++;
		}

		System.out.println(c);
	}
}