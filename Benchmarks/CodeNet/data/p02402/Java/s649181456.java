import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum = 0;
		long[] array = new long[n];
		
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
			sum += array[i];
		}
		Arrays.sort(array);
		
		System.out.println(array[0] + " " + array[array.length - 1] + " " + sum);
		
		sc.close();
	}
}