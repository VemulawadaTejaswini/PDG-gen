
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		List<String> stack = new LinkedList<String>();
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				String block = sc.next();
				stack.add(block);
			}
			else if(cmd.equals("pop")){
				System.out.println(stack.remove(stack.size() -1));
			}
			else if(cmd.equals("quit")){
				break;
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}