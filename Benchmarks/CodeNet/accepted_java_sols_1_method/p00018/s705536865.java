import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] a = new Integer[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a, Collections.reverseOrder());
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				System.out.println(a[i]);
			}else {
				System.out.printf("%d ", a[i]);
			}
		}
	}
}
