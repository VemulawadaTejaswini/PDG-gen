import java.util.*;
public class Main {
	static int k, n = 0;
	static int [] w;
	public static int binSearch(int [] arr, int l, int r,  int trucks) {
		int smallestP = -1;
		
			
			
			int m = (l + r) / 2;
			
			
			
			
			while(l <= r) {
				
				if(loadTrucks(m)) {
					smallestP = m;
					r = m - 1;
					m = (l + r) / 2;
				}
				
				
				else {
					l = m + 1;
					m = (l + r) / 2;
				}
			}
		
		return smallestP;
	}
	
	public static boolean loadTrucks(int p) {
		int i = 0;
		int trucks = 0;
		int sum = 0;
		
		while(i < n && trucks < k) {
			sum = 0;
			while(i < n && sum + w[i] <=p) {
				sum += w[i];
				i++;
			}
			
			trucks++;
		}
		
		return i == n;
		
		
		
		
		
	
				
				
			
			
			
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		k = in.nextInt();
		w = new int [n];
		int sum = 0;
		
		
		for(int i = 0; i < n; i++) {
			int j = in.nextInt();
			sum += j;
			w[i] = j;
		}
		
		System.out.println(binSearch(w, 0, sum, k));
		
	
		
	}
		
		
		

}

