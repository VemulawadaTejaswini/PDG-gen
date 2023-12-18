import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++){
			String input = sc.next();
			
			System.out.println(solve(input));
		}
		
	}
	
	int solve(String input){
		if(!input.startsWith("[")){
			return (Integer.valueOf(input)+1)/2 ;
		}
		
		int depth = 0;
		StringBuilder buf = new StringBuilder();
		LinkedList<Integer> mins = new LinkedList<Integer>(); 
		for(char ch:input.toCharArray()){
			if(ch == '['){
				if(depth == 0){
					buf = new StringBuilder();
				}else{
					buf.append(ch);
				}
				depth++;
			}else if(ch == ']'){
				depth--;
				if(depth == 0){
					mins.add(solve(buf.toString()));
				}else{
					buf.append(ch);
				}
			}else {
				buf.append(ch);
			}
		}
		Collections.sort(mins);
		int ans = 0;
		
		for(int i = 0 ; i < (mins.size()+1)/2;i++){
			ans += mins.get(i);
		}
		return ans;
		
	}
	
}

