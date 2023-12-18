

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[2 * n];
		for (int i = 0; i < 2 * n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		int count = 0;
		for (int i = 0; i < 2 * n; i+=2) {
			if(a[i] < a[i+1]){
				count += a[i];
				//System.out.println(count);
			}else{
				count += a[i+1];
				//System.out.println("b" +count);
			}
		}
		System.out.println(count);
	}
}
