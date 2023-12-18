import java.util.*;
 
public class Main{

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int i = 0;
		while(a[i] % 2 == 0) {
			count++;
			a[i] /= 2; 
			i++;
			i = i % n;
			}
		
		System.out.println(count/n);

	}
}
