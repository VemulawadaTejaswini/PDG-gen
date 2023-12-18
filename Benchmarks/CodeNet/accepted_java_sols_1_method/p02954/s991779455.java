
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			a[i] = 0;
		}
		int ini = 0;
		int r = 0;
		boolean change = false;
		for(int i = 0; i < s.length(); i++) {
			char masu = s.charAt(i);
			if(masu == 'L' && !change && i != s.length() - 1) {
				r = i - 1;
				change = true;
			} else if((masu == 'R' && change) || i == s.length() - 1) {
				if(!change) {
					r = i - 1;
				}
				int even = r - ini;
				if(even % 2 == 0) {
					even++;
					a[r] += even / 2 + 1;
					a[r + 1] += even / 2;
				} else {
					even++;
					a[r] += even / 2;
					a[r + 1] += even / 2;
				}
				if(i == s.length() - 1)
					even = i - (r + 1);
				else
					even = i - 1 - (r + 1);
				if(even % 2 == 0) {
					even++;
					a[r] += even / 2;
					a[r + 1] += even / 2 + 1;
				} else {
					even++;
					a[r] += even / 2;
					a[r + 1] += even / 2;
				}
				ini = i;
				change = false;
			}
		}
		for(int i = 0; i < s.length(); i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
