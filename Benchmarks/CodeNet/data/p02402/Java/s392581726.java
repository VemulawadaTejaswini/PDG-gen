import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
                int array1 = scanner.nextInt();
		int[] array = new int[N-1];
		long sum = array1;
		for(int i = 0 ; i < N-1 ; i++){
			 array[i] = scanner.nextInt();
			 sum = sum + array[i];
		}
		Arrays.sort(array);
		System.out.print(array[0] + " " + array[N-1] + " " + sum);
	}

}