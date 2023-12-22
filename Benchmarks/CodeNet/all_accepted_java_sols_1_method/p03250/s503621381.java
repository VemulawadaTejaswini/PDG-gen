import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int array[] = new int[3];
		
		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		Arrays.sort(array);
		
		System.out.println(array[2] * 10 + array[1] + array[0]);

	
	}
}