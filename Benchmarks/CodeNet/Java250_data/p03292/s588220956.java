import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(array);
		System.out.println(array[2] - array[0]);
	}
}