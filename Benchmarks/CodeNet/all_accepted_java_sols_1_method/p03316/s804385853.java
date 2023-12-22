import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		int keta;
		int sum = 0;
		int a[] = new int[9];
		for(int i = 8;i >= 0;i--) {
			a[i] = (int)Math.pow(10, i);
			keta = n/a[i];
			n = n - a[i] * keta;
			sum = sum + keta;
		}
		if(N%sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}