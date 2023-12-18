import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] array = new long[N];
		long sum = 0L;
		for(int i = 0 ; i < N ; i++){
			 array[i] = scanner.nextLong();
			 sum = sum + array[i];
		}
		Arrays.sort(array);
		System.out.print(array[0] + " " + array[N-1] + " " + sum);
	}
}