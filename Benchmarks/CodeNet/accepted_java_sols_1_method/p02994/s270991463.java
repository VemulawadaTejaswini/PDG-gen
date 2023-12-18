import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		int a = N * L;
		int b = N * (N - 1) / 2;
		
		if(L >= 0) {	
			int result = a + b - L;
			System.out.println(result);
		}else if(L < 0) {
			int last = L + N -1;
			if(last < 0) {
				int res = a + b - last;
				System.out.println(res);
			}else {
				System.out.println(a + b);
			}
		}
	}

}
