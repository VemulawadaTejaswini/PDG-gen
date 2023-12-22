import java.util.*;

public class Main{
	public static void main(String args[]) {
		Queue<String> p = new LinkedList<>();
		Queue<Integer> values = new LinkedList<>();
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();		
		
		int time = 0;
		
		in.nextLine();
		while(n > 0) {
			p.add(in.next());
			values.add(in.nextInt());
			n--;
			
			
		}
		
		while (!p.isEmpty()) {
			String pr = p.poll();
			Integer ti = values.poll();
			
			if (ti <= q)
			{
				time += ti;
				System.out.println(pr + " " + time);
			}
			else
			{
				ti = ti - q;
				p.add(pr);
				values.add(ti);
				time += q;
			}
		}
	
		
		
	
	
	}
	

}
