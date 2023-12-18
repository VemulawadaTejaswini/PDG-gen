import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		ArrayList<Integer> tmp = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				tmp.add(Integer.parseInt(String.valueOf(arr[i]) + String.valueOf(arr[j])));
			}
		}
		Collections.sort(tmp);
		System.out.println(tmp);
		System.out.println(tmp.get(2));
	}
}
