import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0){
				n = stk.pop();
				System.out.println(n);
			}
			else{
				stk.push(n);
			}
		}
	}
}