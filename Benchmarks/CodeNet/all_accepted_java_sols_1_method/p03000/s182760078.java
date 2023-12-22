import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int x = 0,count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count<=t) {
				x++;
			}
			count+=a[i];
		}
      if(count<=t) x++;
		System.out.println(x);
		sc.close();
	}
}