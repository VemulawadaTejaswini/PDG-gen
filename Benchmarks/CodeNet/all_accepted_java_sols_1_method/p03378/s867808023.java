import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[m];
		
		for(int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			
			if(x < a[i]) {
				if(i < m/2) {
					System.out.println(i);
					return;
				}else {
					System.out.print(m-i);
					return;
				}
			}
		}		
		sc.close();
	}
}