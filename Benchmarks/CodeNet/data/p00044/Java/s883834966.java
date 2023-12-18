import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int max = 60000;
	static boolean[] isPrime = new boolean[max];
	public static void main(String[] args) {
		aryPrime();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i < max; i++) {
			if(isPrime[i]) {
				list.add(i);
			}
		}
		Integer[] p = list.toArray(new Integer[list.size()]);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int low = bs_lower(p, n);
			int up = bs_upper(p, n);
			System.out.printf("%d %d\n", p[low], p[up]);
		}
		sc.close();
	}
	static int bs_upper(Integer[] p, int k) {
		int l = -1;
		int r = p.length;
		int mid = 0;
		while(r - l > 1) {
			mid = l + (r - l) / 2;
			if(p[mid] > k) {
				r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}
	static int bs_lower(Integer[] p, int k) {
		int l = -1;
		int r = p.length;
		int mid = 0;
		while(r - l > 1) {
			mid = l + (r - l) / 2;
			if(p[mid] < k) {
				l = mid;
			}else {
				r = mid;
			}
		}
		return l;
	}
	static void aryPrime(){
        int l = isPrime.length;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(l); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
