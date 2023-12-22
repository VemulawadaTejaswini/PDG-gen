import java.util.*;
public class Main {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
			// 1個でも条件を満たさなければDENIED
			if(!check(a[i])) {
				System.out.println("DENIED");
				return;
			}
		}
		System.out.println("APPROVED\n");
		
	}

	// 奇数なら判定しなくていいのでtrue扱い
	// 偶数ならさらに判定する
	private static boolean check(int num) {
		if(num%2 != 0 ) {
			return true;
		}
		if(num%3 == 0 || num%5 == 0) {
			return true;
		}else {
			return false;
		}
	}
}