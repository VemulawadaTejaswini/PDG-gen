import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List <Integer> N = new ArrayList<Integer>();
		List <Integer> X = new ArrayList<Integer>();
		int n;
		int x;
		do {
			n = stdIn.nextInt();
			x = stdIn.nextInt();
			N.add(n);
			X.add(x);
		} while (n != 0 || x != 0);
		
		int[] ans = new int[N.size()-1];
		for(int i = 0; i < N.size()-1; i++) {
			for(int j = 1; j <= N.get(i)-2; j++) {
				for(int k = j+1; k <= N.get(i)-1; k++) {
					if(j + k > X.get(i)) {
						break;
					}
					for(int l = k+1; l <= N.get(i); l++) {
						if(j + k + l == X.get(i)) {
							ans[i]++;
						}
						if(j + k + l > X.get(i)) {
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i < N.size()-1; i++) {
			System.out.println(ans[i]);
		}
		
	
	}
}