import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dishes = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			dishes[i] = sc.nextInt();
			sum += dishes[i];
			dishes[i] = (10 - (dishes[i] % 10)) % 10;
		}
		Arrays.sort(dishes);
		for(int i = 0; i < 4; i++) {
			sum += dishes[i];
		}
		System.out.println(sum);
	}
}