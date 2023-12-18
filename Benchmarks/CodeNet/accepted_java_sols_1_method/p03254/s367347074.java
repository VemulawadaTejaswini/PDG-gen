import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		Integer[] array = new Integer[X];
		int count = 0;
		
		for(int i =0; i < X; i++ ) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		
		for(int i =0; i < X ; i++) {
			if(array[i] <= A) {
				A -= array[i];
				count++;
			}
		}
		if(count == X && A != 0) {
			count--;
		}
		System.out.println(count);
	}
}
