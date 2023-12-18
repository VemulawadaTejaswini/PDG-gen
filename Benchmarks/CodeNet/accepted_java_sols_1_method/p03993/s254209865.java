import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextInt()-1;
		}
		for(int i = 0; i < n; i++) {
			if(i==a[a[i]] && i < a[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}