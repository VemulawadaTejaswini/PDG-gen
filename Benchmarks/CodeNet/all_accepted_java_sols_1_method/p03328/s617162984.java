import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int a =Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		sc.close();

		int diff = b-a;
		int bTowerHight = (1+diff)*diff/2;
		System.out.println(bTowerHight-b);
	}
}
