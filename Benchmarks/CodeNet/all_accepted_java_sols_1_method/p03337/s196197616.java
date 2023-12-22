import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int add = A + B;
		int sub = A - B;
		int mul = A * B;

		//add,sub,mulのうちで最大のものを求める
		int array[] = {add, sub, mul};
		Arrays.sort(array);

		//System.out.println(array[0]);
		//System.out.println(array[1]);
		System.out.println(array[2]);
	}
}
