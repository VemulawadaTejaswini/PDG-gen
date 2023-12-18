import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mem;
		int n,time,i;
		
		n = sc.nextInt();
		time = sc.nextInt();
		mem = new int[n];
		
		for (i=0 ; i<n ; i++) {
			mem[i] = i+1;
		}
		
		for (i=0 ; i<time ; i++) {
			String reader;
			String[] swap;
			swap = new String[2];
			reader = sc.next();
			swap = reader.split(",");
			
			int a = Integer.parseInt(swap[0])-1;
			int b = Integer.parseInt(swap[1])-1;
			
			int m = mem[a];
			mem[a] = mem[b];
			mem[b] = m;
		}
		
		for (i=0 ; i<n ; i++) {
			System.out.println(""+mem[i]);
		}
		
		sc.close();
	}
}
