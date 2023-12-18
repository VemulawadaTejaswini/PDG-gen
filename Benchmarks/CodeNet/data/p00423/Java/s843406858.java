import java.util.ArrayList;
import java.util.Scanner;

public class q0500 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		int n = s.nextInt();
		while(n != 0){
			int x[] = new int[n];
			int y[] = new int[n];
			int x1 = 0;
			int y1 = 0;
			
			for(int i = 0; i < n; i++){
				x[i] = s.nextInt();
				y[i] = s.nextInt();
				
				if(x[i] > y[i]){
					x1 += x[i] + y[i];
				}
				else if( x[i] < y[i]){
					y1 += x[i] + y[i];
				}
				else{
					x1 += x[i];
					y1 += y[i];
				}
			}
			a.add(x1);
			b.add(y1);
			n = s.nextInt();
		}
		
		for (int i = 0 ;i < a.size() ; i++){
		      System.out.println(a.get(i) + " " + b.get(i));
		}

	}
}