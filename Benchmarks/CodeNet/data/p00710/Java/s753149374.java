import java.util.*;
public class Main {
	public static int[] swap(int[] a, int p, int c) {
			int[] tmp = new int[a.length];
			int n = tmp.length;
			int lastA = 0;
			for(int i = 0; i < n - p + 1 - c; i++) {
				tmp[i] = a[i];
			}
			for(int i = 0; i < p - 1; i++) {
				tmp[i + (n - p + 1 - c)] = a[i + (n - p + 1)];
			}
			for(int i = 0; i < c; i++) {
				tmp[i + (n - c)] = a[i + (n - p + 1 - c)];
			}
			return tmp;
			
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			if(n == 0 && r == 0) {
				break;
			}
			
			int[] card = new int[n];
			for(int i = 0; i < n; i++) {
				card[i] = i+1;
			}
		
			for(int i = 0; i < r; i++) {
				int p = stdIn.nextInt();
				int c = stdIn.nextInt();
				card = swap(card,p,c);
				
			}
			System.out.println(card[card.length - 1]);
		}
	}
}