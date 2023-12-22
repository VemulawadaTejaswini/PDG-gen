import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		int[] seq = new int[n];
		arr = sc.nextLine().split(" ");
		for(int i=0; i<seq.length; i++)
			seq[i] = Integer.parseInt(arr[i]);
		sc.close();

		int count = 1 + (int)Math.ceil((double)(n-k)/(k-1));
		System.out.println(count);
	}
}
