import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = seer.nextInt();
		}
		int tot = 0;
		for(int i = 0; i < n; i++){
			int c = seer.nextInt();
			if(arr[i] > c) tot += arr[i]-c;
		}
		System.out.println(tot);
	}

}
