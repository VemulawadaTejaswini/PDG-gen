import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String[] array = br.readLine().split(" ");
		Deque<String> mainDeque = new ArrayDeque<>();
		for(String str: array){
			mainDeque.offerLast(str);
		}
		Deque<Integer> intDeque = new ArrayDeque<>();
		
		while(!mainDeque.isEmpty()){
			String str = mainDeque.pop();
			try{
				int iv = Integer.parseInt(str);
				intDeque.push(iv);
			}catch(NumberFormatException e){
				int v2 = intDeque.pop();
				int v1 = intDeque.pop();
				
				int result = 0;
				switch (str) {
				case "+":
					result = v1 + v2;
					break;
				case "-":
					result = v1 - v2;
					break;
				case "*":
					result = v1 * v2;
					break;
				}
				
				intDeque.push(result);
			}
		}
		
		System.out.println(intDeque.pop());
	}
}

