import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String dummyN = sc.nextLine();
		int N = Integer.parseInt(dummyN);

		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int[] array = new int[N];

		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(lines[i]);
		}

		int num1 = -1;
		int num2 = -1;

		for(int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				if(num1 < 0) {
					num1 = i;
				}else {
					num2 = i+1;
				}

			}
		}

		if(num1 != -1 && num2 != -1) {
			int temp = array[num1];
			array[num1] = array[num2];
			array[num2] = temp;
		}

		boolean flag = true;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != i+1) {
				flag = false;
				break;
			}
		}

		if(flag) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
