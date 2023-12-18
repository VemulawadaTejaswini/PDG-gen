
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		List<Integer> L = new ArrayList<Integer>();
		List<Integer> R = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			L.add(a[i]);
		}
		
		int [][]b = new int [n][1000001];
		int []d = new int [1000001];
		
		int cnt = n;
		for(int i = 0 ; i < n ;i++) {
			boolean jdg = true;
			for(int j = 1 ; j * j <= a[i] ; j++) {
				if(a[i] % j == 0) {
					if(L.contains(j)) {
						jdg = false;
						break;
					}
					if(j != 1 && L.contains(a[i]/j)) {
						jdg = false;
						break;
					}
				}
			}
			if(!jdg) {
				cnt--;
				}
			else {
				R.add(a[i]);
			}
		}
		
		int p = 1;
		boolean jdg = false;
		for(int i = 0 ; i < n-1  ;i++) {
			if(!R.contains(a[i])&& jdg) {
				cnt -= p;
				p = 1;
				jdg = false;
			}

			if(a[i] == a[i+1] && R.contains(a[i])) {
				p++;
				jdg = true;
			}
		}
		if(jdg) {
			cnt -= p;
		}
		
		System.out.println(cnt);
		
	}
	
}
