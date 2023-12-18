import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			if(array[i]==0) {
				System.out.println(i+1);
			}

		}
		sc.close();


	}
}
