
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = a[0] + a[1];
		System.out.println(ans);
		sc.close();
	}
	
    
}
