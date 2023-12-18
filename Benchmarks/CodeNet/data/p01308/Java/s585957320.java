import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int SIZE = 12;
	
	public static int next(int m){
		return (m + 1) % SIZE;
	}
	
	public static int prev(int m){
		return (m - 1 + SIZE) % SIZE;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("C" , 0);
		map.put("C#", 1);
		map.put("D" , 2);
		map.put("D#", 3);
		map.put("E" , 4);
		map.put("F" , 5);
		map.put("F#", 6);
		map.put("G" , 7);
		map.put("G#", 8);
		map.put("A" , 9);
		map.put("A#", 10);
		map.put("B" , 11);
		
		final int T = sc.nextInt();
		
		for(int tt = 0; tt < T; tt++){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			int[] stairs = new int[n];
			int[] hope = new int[m];
			
			for(int i = 0; i < n; i++){
				stairs[i] = map.get(sc.next());
			}
			for(int i = 0; i < m; i++){
				hope[i] = map.get(sc.next());
			}
			
			LinkedList<Integer> cur_pos = new LinkedList<Integer>();
			LinkedList<Integer> perhap   = new LinkedList<Integer>();
			cur_pos.add(-1);
			perhap.add(0);
			
			boolean flag = false;
			LOOP:
			while(!cur_pos.isEmpty()){
				final int pos = cur_pos.poll();
				final int purpose = perhap.poll();
				
				//System.out.println(Arrays.toString(stairs));
				//System.out.println(Arrays.toString(hope));
				//System.out.println(pos + " " + purpose);
				
				if(purpose == m){
					if(pos + 1 == n || pos + 2 == n){
						flag = true;
						break LOOP;
					}
				}else{
					if(pos - 1 >= 0 && hope[purpose] == prev(stairs[pos - 1])){
						cur_pos.add(pos - 1);
						perhap.add(purpose + 1);
					}
					
					if(pos + 1 >= 0 && pos + 1 < n && hope[purpose] == stairs[pos + 1]){
						cur_pos.add(pos + 1);
						perhap.add(purpose + 1);
					}
					
					if(pos + 2 >= 0 && pos + 2 < n && hope[purpose] == next(stairs[pos + 2])){
						cur_pos.add(pos + 2);
						perhap.add(purpose + 1);
					}
				}
			}
			
			System.out.println(flag ? "Yes" : "No");
		}
	}

}