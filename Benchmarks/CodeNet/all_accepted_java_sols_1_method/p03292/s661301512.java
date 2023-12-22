import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
			int hoge;
			for(int i = 0;i < a.length;i++) {
				for(int j = 0 ;j < i ;j++) {
					if(a[i] < a[j]) {
						hoge = a[i];
						a[i] = a[j];
						a[j] = hoge;
					}
				}
			}
			hoge = a[1] - a[0];
			hoge += a[2] - a[1];
			System.out.println(hoge);
	}

}
