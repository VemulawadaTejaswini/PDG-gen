import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
