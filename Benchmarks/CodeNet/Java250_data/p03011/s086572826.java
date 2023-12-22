import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] array = new int[3];
		array[0]=n;
		array[1]=m;
		array[2]=k;

		long count=0;
		Arrays.sort(array);

		/*if(n==m) {
			System.out.println(n*2);
		}else {
			System.out.println(Math.max(n, m)+Math.max(n, m)-1);
		}*/

		System.out.println(array[0]+array[1]);
	}
}


