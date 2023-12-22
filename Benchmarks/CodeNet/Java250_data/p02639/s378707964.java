import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			int a = arr[i];
			if (a == 0) {
				System.out.println(i + 1);
			}
		}
	}
}