import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int sum = 0;
		String[] tempList = scanner.nextLine().split(" ");
		int[] list = new int[m];
		for(int i= 0; i < m; i++) {
			list[i] = Integer.parseInt(tempList[i]);
		}

		for(int value : list) {
			sum += value;
		}

		if(sum <= n) {
			System.out.println(n - sum);
		}else{
			System.out.println( -1);
		}

	}

}