import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		if ((arr[1] - arr[0]) % 2 != 0) {
			count++;
			arr[1]++;
			arr[2]++;
		}
		count += (arr[1] - arr[0]) / 2;
		count += arr[2] - arr[1];
		System.out.println(count);
	}
}
