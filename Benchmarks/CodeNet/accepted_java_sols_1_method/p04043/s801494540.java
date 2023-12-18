import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = new int[8];

		arr[a]++;
		arr[b]++;
		arr[c]++;

		if(arr[5] == 2 && arr[7] == 1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}