import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int N = sc.nextInt();
		for (int i=1;i<10;i++) {
			a[i-1] = i*100+i*10+i;
		}
		for (int i=0;i<10;i++) {
			if (N<=a[i]) {
				System.out.println(a[i]);
				return ;
			}
		}
	}
}