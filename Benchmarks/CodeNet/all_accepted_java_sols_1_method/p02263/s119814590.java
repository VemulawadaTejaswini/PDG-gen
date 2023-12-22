import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] formula = br.readLine().split(" ");
		
		Deque<String> deq = new ArrayDeque<String>();
		
		for(int i = 0; i < formula.length; i++){
			int tmp1; 
			int tmp2;
			
			switch(formula[i]){
			case "+":
				tmp1 = Integer.parseInt(deq.removeFirst());
				tmp2 = Integer.parseInt(deq.removeFirst());
				
				deq.addFirst(Integer.toString(tmp2 + tmp1));
				break;
				
			case "*":
				tmp1 = Integer.parseInt(deq.removeFirst());
				tmp2 = Integer.parseInt(deq.removeFirst());
				
				deq.addFirst(Integer.toString(tmp2 * tmp1));
				break;
				
			case "-":
				tmp1 = Integer.parseInt(deq.removeFirst());
				tmp2 = Integer.parseInt(deq.removeFirst());
				
				deq.addFirst(Integer.toString(tmp2 - tmp1));
				break;
				
			default:
				deq.addFirst(formula[i]);
				break;
			}
		}
		
		System.out.println(deq.removeLast());
	}

}