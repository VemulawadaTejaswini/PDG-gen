import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int alice = 0;
		int bob = 0;

		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);

		alice = rep(array,1);
		bob = rep(array,2);
		
		System.out.println(alice-bob);
	}
	static int rep(int[] array,int num) {
		int sum = 0;
		for(int i = array.length-num; i >= 0; i-=2) {
			sum += array[i];
		}
		return sum;
	}
}
