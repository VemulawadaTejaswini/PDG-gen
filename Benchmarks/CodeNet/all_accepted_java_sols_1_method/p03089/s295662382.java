
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		List <Integer> a = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ;i++) {
			int b = Integer.parseInt(sc.next());
			a.add(b);
		}
		int []c = new int [n];
		int m = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = a.size()-1 ; j >= 0; j--) {
				if(a.get(j) == j+1) {
					c[m] = j+1;
					m++;
					a.remove(j);
					break;
				}
			}
		}
		
		if(a.size() != 0) {
			System.out.println(-1);
		}
		
		else {
			for(int i = n-1; i >= 0 ; i--) {
				System.out.println(c[i]);
			}
		}
	}

}
