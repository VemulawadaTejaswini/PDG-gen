import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//マスの数(1～100の範囲)
		int n = Integer.parseInt(sc.next());
		int result = 0;
		//マスに入っている値
		for(int i = 0; i < n; i++) {
			int der1 = i%2;
			int a = Integer.parseInt(sc.next());
			int der2 = a%2;
			if (der1==0 && der2==1) {
				result++;
			}
		}
		System.out.println(result);
	}	
}
