import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int all = 0;
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] c = new int[N-1];
		
		ArrayList<Integer> CN = new ArrayList<>();
		
		int check, checkB = 0;
		checkB = sc.nextInt();
		
		for(int i = 0; i < N-1; i++) {
			check = sc.nextInt();
			if(checkB == (check-1)) {
				CN.add(checkB);
			}
			checkB = check;
		}
		
		for(int j = 0; j < N; j++) {
			all = all + sc.nextInt();
		}
		
		Collections.sort(CN);
		for(int k = 0; k < N-1; k++) {
			c[k] = sc.nextInt();
		}
		
		for(int l = 0; l < CN.size(); l++) {
			all = all + c[CN.get(l)-1];
		}
		
		System.out.println(all);
	}
}