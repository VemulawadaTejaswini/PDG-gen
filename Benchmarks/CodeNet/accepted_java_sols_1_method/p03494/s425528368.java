import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("a");
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			//System.out.println("a");
			a[i] = sc.nextInt();
		}
		tp:while(true) {
			for(int i = 0;i<a.length;i++) {
				if((a[i]%2)!=0) {
					break tp;
				}
			}
			for(int i = 0;i<a.length;i++) {
				a[i] = a[i]/2;
			}
			count++;
		}
		System.out.println(count);
	}
}