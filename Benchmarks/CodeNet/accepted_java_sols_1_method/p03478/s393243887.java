import java.util.*;
public class Main {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int total = 0; 
		
		for (int i = 1; i <= N ; i++ ) {
			
			String judge = String.valueOf(i);
			
			String[] nums = judge.split("");
			
			
			int judgeNum = 0; 
			
			for (String numString :nums) {
			
				int num = Integer.parseInt(numString);
			
				judgeNum  += num;
			}
			
			if (A <= judgeNum && B >= judgeNum ) 
				total += i; 
			
		}
		
		System.out.println(total);
					
	}	


}