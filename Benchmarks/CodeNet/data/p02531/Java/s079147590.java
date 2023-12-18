import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);
		Stack<String> block=new Stack<String>();

		while(true){
			String order=sc.next();
			if(order.equals("push"))
				block.push(sc.next());
			else if(order.equals("pop")){
				System.out.println(block.pop());
			}
			else if(order.equals("quit"))
				break;
		}
		
	}
}