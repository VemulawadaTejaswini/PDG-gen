import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];

		for(int i = 0; i < num.length; i++)
			num[i] = sc.nextInt();

		for(int i = 0; i < num.length; i++)
			for(int j = i + 1; j < num.length; j++)
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

		System.out.printf("%d %d %d\n", num[0], num[1], num[2]);
	}
}