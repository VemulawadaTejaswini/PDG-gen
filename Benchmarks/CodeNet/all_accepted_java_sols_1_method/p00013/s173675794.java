import java.util.*;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> data = new Stack<Integer>();
		while(s.hasNext()){
			int in = s.nextInt();
			if(in != 0)
				data.push(new Integer(in));
			else
				System.out.println(data.pop());
		}
    }
}