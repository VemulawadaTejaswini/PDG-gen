import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int left = sc.nextInt();
		int right = sc.nextInt();
		int types = 0;
		for (int i = left; i <= right; i++) {
		    if (height % i == 0) {
		        types++;
		    }
		}
		System.out.println(types);
	}
}

