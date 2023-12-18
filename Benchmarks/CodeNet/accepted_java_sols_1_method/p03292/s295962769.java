import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int numbers[] = new int[3];
		for(int i =0; i < 3; i ++) {
			numbers[i] = a.nextInt();
		}
		Arrays.sort(numbers);
		int A = numbers[1] - numbers[0];
		int B = numbers[2] - numbers[1];
		int C = A + B ;
		String s = String.valueOf(C);
		System.out.println(s);
   }
}