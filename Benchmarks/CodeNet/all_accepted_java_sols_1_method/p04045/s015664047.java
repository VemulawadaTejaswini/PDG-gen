import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String arr[] = new String[K];
		
		for(int i = 0;i<K;i++) {
			arr[i] = sc.next();
		}
		
		loops : for(int i = N;i < 100000;i++) {
			String ans = String.valueOf(i);
			for(String a : arr) {
				if(ans.contains(a)) {
					continue loops;
				}
			}
			System.out.println(i);
			break;
		}
	}
}
