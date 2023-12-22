import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] num = new int[a];
		long sum = 0;
		int temp;
		for(int i = 0; i < a; i++) {
			num[i] = input.nextInt();
		}
		for(int j = 0; j < num.length; j++) {
			sum += num[j];
		}
		for (int i = 0; i < num.length; i++) {
			int min = num[i];
            temp = i;
			for (int j = i + 1; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					temp = j;
				}
			}
			num[temp] = num[i];
			num[i] = min;
		}
		System.out.println(num[0]+" "+num[a-1]+" "+sum);
	}
}
