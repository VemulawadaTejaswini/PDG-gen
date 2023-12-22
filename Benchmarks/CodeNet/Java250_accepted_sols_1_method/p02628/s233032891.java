import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		int array[] = new int[a];

		for(int i = 0;i < a; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for(int i = 0;i < b;i++) {
			sum += array[i];
		}
		System.out.println(sum);
		scan.close();
	}
}