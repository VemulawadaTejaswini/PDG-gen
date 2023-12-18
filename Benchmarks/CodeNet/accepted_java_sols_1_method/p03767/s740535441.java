import java.util.*;
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[3 * n];
		for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
		Arrays.sort(array);
		int head = array.length - 2;
		long res = 0;
		for (int i = 0; i < n; i++) {
			res += array[head];
			head -= 2;
		}
		System.out.println(res);
	}

}
