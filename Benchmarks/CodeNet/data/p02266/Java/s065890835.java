
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static Stack<Entry<Integer, Integer>> simulate(String mount){
		Stack<Integer> patches = new Stack<Integer>();
		Stack<Entry<Integer, Integer>> results = new Stack<Entry<Integer, Integer>>();
		int total = 0;
		int i = 0;
		while(i < mount.length()) {
			// the negative slope
			if(mount.charAt(i) == '\\') {
				//push the index
				patches.push(i);
			}else if(mount.charAt(i) == '/') {
				if(!patches.isEmpty()) {
					int s = patches.pop();
					int sum = i - s;
					total += sum;
					while(!results.isEmpty() && results.peek().getKey() >= s) {
						sum += results.pop().getValue(); // include the area
					}
					
					results.push(new AbstractMap.SimpleEntry<Integer, Integer>(s, sum));
				}
			}
			
			
			i++;
		}
		
		results.push(new AbstractMap.SimpleEntry<Integer, Integer>(total, total));

		return results;
		
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		String mount = cin.nextLine();
		Stack<Entry<Integer, Integer>> s = simulate(mount);
		
		System.out.println(s.pop().getValue());
		System.out.print(s.size());
		if(s.size() == 0) {
			System.out.print("\n");
		}else {
			System.out.print(" ");
		}
		
		Iterator<Entry<Integer, Integer>> iter = s.iterator(); 
		
		
		while(iter.hasNext()) {
			System.out.print(iter.next().getValue());
			if(iter.hasNext()) {
				System.out.print(" ");
			}else {
				System.out.println();
			}
			
		}
		
		
		cin.close();
		

	}
	
	

}