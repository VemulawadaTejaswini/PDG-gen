import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt() - 1;
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			int targetIndex = arr[i];
			if(arr[targetIndex] == i)
				count++;
		}
		System.out.println(count/2);
	}
}
