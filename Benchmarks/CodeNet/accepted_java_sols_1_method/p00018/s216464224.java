import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int list[] = new int[5];
		
		for(int i = 0;i < 5;i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);

		for (int i = list.length; i > 1; i--) {
			System.out.print(list[i - 1] + " ");
		}
		System.out.println(list[0]);

	}

}