import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int leng = sc.nextInt();
		String[] input = new String[num];
		for(int i = 0; i < num; i++) {
			input[i] = sc.next();
		}
		Arrays.sort(input);
		for(String result: input) {
			System.out.print(result);
		}
	}

}
