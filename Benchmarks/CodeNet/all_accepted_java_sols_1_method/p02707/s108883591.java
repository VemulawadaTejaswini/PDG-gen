import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int array[] = new int[n];

		int val = 0;

		for (int l = 0; l < n-1; l++) {
			val = sc.nextInt();
			array[val-1] = array[val-1]+1;
		}

		for(int l:array) {
			System.out.println(l);
		}

	}


}
