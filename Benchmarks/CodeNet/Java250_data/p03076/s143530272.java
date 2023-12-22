import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int[] array = new int[5];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		array[3] = d;
		array[4] = e;
		int[] sort = new int[5];
		sort[0] = a % 10 == 0 ? 10 : a % 10;
		sort[1] = b % 10 == 0 ? 10 : b % 10;
		sort[2] = c % 10 == 0 ? 10 : c % 10;
		sort[3] = d % 10 == 0 ? 10 : d % 10;
		sort[4] = e % 10 == 0 ? 10 : e % 10;
		Arrays.sort(sort);
		int modMin = sort[0];
		int ans = 0;
		boolean done = false;
		for(int i = 0 ; i < 5 ; i++) {
			if(array[i] % 10 == modMin && !done) {
				ans += array[i];
				done = true;
			} else {
				ans += array[i];
				if(array[i] % 10 != 0) {
					ans += (10 - array[i] % 10);
				}
			}
		}

		System.out.println(ans);
		sc.close();

	}

}
