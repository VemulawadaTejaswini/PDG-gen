import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int bot = arr[n/2-1];;
		int top = arr[(n/2)];
		System.out.println(top-bot);
	}

}
