import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
			if(h.containsKey(a[i]))
			h.put(a[i],h.get(a[i])+1);
			else
			h.put(a[i],1);
		}
		
		int ctr = 0;
		for(int i=0;i<n;i++) {
			int k = a[i];
			if(h.get(a[i])>1) {
				ctr++;
			}
			else {
				for(int j=2;j*j<=k;j++) {
					if(k%j==0) {
						if(h.containsKey(j) || h.containsKey(k/j)) {
							ctr++;
							break;
						}
					}
				}
			}
			
		}
		System.out.println(n-ctr);
		
	}
}