import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m , cnt = 1;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		m = a[0];
		while(m != 2) {
			m = a[m-1];
			cnt++;
			if(cnt > n) {
				cnt = -1;
				break;
			}
		}
		System.out.print(cnt);
		
		
	}

}