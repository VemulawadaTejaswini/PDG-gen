import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int n = sc.nextInt();
			sc.nextLine();
			
			int[] start = new int[n];
			int[] goal = new int[n];
			
			String line = null;
			
			for(int i = 0; i < n; i++){
				line = sc.nextLine();
				start[i] = line.charAt(0) * 100000 + line.charAt(1) * 10000 + line.charAt(3) * 1000 + line.charAt(4) * 100 + line.charAt(6) * 10 + line.charAt(7);
				goal[i] = line.charAt(9) * 100000 + line.charAt(10) * 10000 + line.charAt(12) * 1000 + line.charAt(13) * 100 + line.charAt(15) * 10 + line.charAt(16);
			}
			
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(0);
			int sum = 0;
			int gsum = 0;
			int ssum = 1;
			
			while(true){
				if(start[ssum] < goal[gsum]){
					stack.push(0);
					ssum++;
					if(stack.size() > sum){
						sum = stack.size();
					}
				}else{
					stack.pop();
					gsum++;
				}
				if(ssum == start.length || gsum == goal.length){
					break;
				}
				

				
			}
			System.out.println(sum);
			
			
		}
		
	}

}