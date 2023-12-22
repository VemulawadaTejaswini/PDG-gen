import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		Arrays.sort(array);
		int count;
		for(count = 0; x > 0 && count < array.length; count++) {
			x -= array[count];
		}
		if(x != 0)
			count--;
		System.out.println(count);
	}
}