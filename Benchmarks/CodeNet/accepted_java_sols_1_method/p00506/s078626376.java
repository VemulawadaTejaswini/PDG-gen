import java.util.Scanner;

public class Main {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = 1000000000;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < min) min = arr[i];
		}

		for(int i = 1; i <= min; i++) {
			boolean devide = true;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] % i != 0) {
					devide = false;
				}
			}
			if(devide) System.out.println(i);
		}
	}
}
