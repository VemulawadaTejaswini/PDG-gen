import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		
		int count = 0;
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= max)
				count++;
			max = Math.max(max, array[i]);
		}
		
		System.out.println(count);
	}
}
