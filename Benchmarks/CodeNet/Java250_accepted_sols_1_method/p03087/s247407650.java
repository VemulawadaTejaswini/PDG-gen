import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
         
     try (Scanner scan = new Scanner(System.in)) {
			int inputN = scan.nextInt();
			int inputQ = scan.nextInt();
			int[] memory = new int[inputN+1];
       		memory[0] = 0;
			String inputStr = scan.next();
			
			for(int n=2; n < inputN+1; n++) {
				memory[n] = memory[n-1];
				if('A'==(inputStr.charAt(n-2)) && 'C'==(inputStr.charAt(n-1))) {
					memory[n]++;
				}
			}
			
			List<Integer> ans = new ArrayList<>();
			
			for (int i = 0; i < inputQ; i++) {
				int inputI = scan.nextInt();
				int inputR = scan.nextInt();
				ans.add(memory[inputR]-memory[inputI]);
			}
			
			for (int i = 0; i < inputQ; i++) {
				System.out.println(ans.get(i));
			
			}
		}
    }
}