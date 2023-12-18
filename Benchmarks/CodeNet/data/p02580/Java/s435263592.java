import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		int n = s.nextInt();
		long max = 0;
		int tmp = 0;
		long rows[] = new long[h+1];
		long cols[] = new long[w+1];
				
		for(int i = 0; i < n; i++) {
			
			tmp = s.nextInt();			
			rows[tmp] += 1;			
			
			if(rows[tmp] > max)
				max = rows[tmp];
			
			tmp = s.nextInt();	
			cols[s.nextInt()] += 1;
			
			if(cols[tmp] > max)
				max = cols[tmp];
			
		}
		
		System.out.println(max);	
		
	}


}