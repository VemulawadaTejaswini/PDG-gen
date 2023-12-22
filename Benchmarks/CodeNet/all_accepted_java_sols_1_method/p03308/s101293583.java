import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] array = Arrays.stream(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		System.out.println(array[array.length - 1] - array[0]);
	}
}