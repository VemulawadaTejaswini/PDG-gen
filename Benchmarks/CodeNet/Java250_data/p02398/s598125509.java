import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[3];
		num[0] = scn.nextInt();
		num[1] = scn.nextInt();
		num[2] = scn.nextInt();
		int sum =0;
		for (int i=num[0]; i >= num[0] && i<= num[1] ; i++) {
			if (num[2]%i == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}

