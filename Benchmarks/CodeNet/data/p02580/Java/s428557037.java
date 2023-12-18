import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		int n = s.nextInt();
		long maxr = 0;
		long maxc = 0;
		int ic = 0;
		int ir = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		long rows[] = new long[h+1];
		long cols[] = new long[w+1];
		long mtch[] = new long[n];
		long mtch2[] = new long[n];
		
		if(h == 1 || w == 1) {
			
			System.out.println(n);
			return;
			
		}
				
		for(int i = 0; i < n; i++) {
			
			tmp1 = s.nextInt();						
						
			rows[tmp1] += 1;	
			
			if(rows[tmp1] > maxr) {
				maxr = rows[tmp1];
				ir = tmp1;
			}
			
			tmp2 = s.nextInt();
			
			cols[tmp2] += 1;
			
			if(cols[tmp2] > maxc) {
				maxc = cols[tmp2];
				ic = tmp2;
			}	
			
			mtch[i] = tmp1;
			mtch2[i] = tmp2;
			
		}
		
		int min = 0;
		
		for(int i = 0; i < mtch.length; i++) {
			
			if(mtch[i] == ir && mtch2[i] == ic)
				min = 1;
			
		}
		
		System.out.println(maxr + maxc - min);	
		
	}


}
