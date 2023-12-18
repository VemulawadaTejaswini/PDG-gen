import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int u = scan.nextInt();
			ten[] map = new ten[u];
			Map<Integer,ArrayList<Integer>>D = new TreeMap<Integer,ArrayList<Integer>>();
			
			for(int i = 0;i<u;i++) {
				map[i] = new ten(scan.nextInt());
				D.put(map[i].num, new ArrayList<Integer>());
				int k = scan.nextInt();
				for(int j = 0;j<k;j++) {
					D.get(map[i].num).add(scan.nextInt());
				}
				
			}
			
			
			
			Deque<ten> dec = new ArrayDeque<ten>();
			dec.addFirst(map[0]);
			map[0].kyori = 0;
			map[0].se = true;
			
			while(!dec.isEmpty()) {
				ten p = dec.removeLast();
				ArrayList<Integer>P = D.get(p.num);
				for(Integer t:P) {
					if(map[t-1].se ==false) {
						dec.addFirst(map[t-1]);
						map[t-1].se = true;
						map[t-1].kyori = p.kyori+1;
						
					}
				}
			}
			
			for(int i = 0;i<u;i++) {
				System.out.print(map[i].num);
				System.out.print(" ");
				System.out.print(map[i].kyori);
				System.out.println();
			}
			
			
		}
		
		
	}
	
	
	
	static class ten{
		int num;
		boolean se;
		int kyori = -1;
		ten(int n){
			num = n;
		}
	}
		

}

