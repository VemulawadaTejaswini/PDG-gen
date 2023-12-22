import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		
		int count = 1;
		for(int i = 1; i < array.length; i++) {
			boolean flag = true;
			for(int j = 0; j < i; j++)
				if(array[j] > array[i])
					flag = false;
			count += flag ? 1 : 0;
		}
		
		System.out.println(count);
	}
}
