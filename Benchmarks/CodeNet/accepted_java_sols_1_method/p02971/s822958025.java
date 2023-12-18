import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] tmp = new int[n];
		int[] max = new int[n];
		for (int i =0;i<n;i++) {
			array[i]=sc.nextInt();
			tmp[i]=array[i];
			max[i]=0;
		}

		Arrays.sort(tmp);
		int a = tmp[n-1];
		int b = tmp[n-2];

		for(int i=0;i < n; i++) {
			if(a == array[i]) {
				max[i] = b;
			}else max[i] =a;
		}

		for(int i=0; i < n; i++)
		System.out.println(max[i]);

		sc.close();
	}
}
