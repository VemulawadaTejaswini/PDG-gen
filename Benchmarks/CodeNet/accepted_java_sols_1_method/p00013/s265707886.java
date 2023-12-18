import java.math.*;
import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n==0){
				System.out.println(st.pop());
			}
			else{
				st.push(new Integer(n));
			}
		}
	}

}