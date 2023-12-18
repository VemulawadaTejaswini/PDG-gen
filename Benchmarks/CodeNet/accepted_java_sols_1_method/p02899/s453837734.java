import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nlist[] = new int[n];
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			nlist[a - 1] = i;
		}
		for(int i=0 ; i < n ; i++) {
			System.out.print(nlist[i] + " ");
		}
		sc.close();
	}

}