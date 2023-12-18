import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int pre = -1;
		for(int i = 0; i  < n; i++) {
			if(pre <= h[i]-1) {
				pre = h[i]-1;
			}
			else if(pre <= h[i]) {
				pre = h[i];
			}
			else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}