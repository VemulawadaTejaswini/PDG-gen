import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		long array[] = new long [n];
		for(int i = 0; i<n;i++){
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);
		long sum = 0;
		for(int i = 0; i<n-k;i++){
			sum += array[i];
		}
System.out.println(sum);
	}
}