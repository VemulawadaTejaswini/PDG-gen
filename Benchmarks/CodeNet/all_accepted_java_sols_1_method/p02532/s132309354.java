import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		List<String> list = new ArrayList<String>();
		@SuppressWarnings("unchecked")
		Stack<String>[] stack = new Stack[n];
		for(int i=0;i<n;i++){
			stack[i] = new Stack<String>();
		}
		
		while(true){
			String[] s = sc2.nextLine().split("[\\s]+");
			
			if(s[0].equals("quit")) break;
			else if(s[0].equals("push")) {
				int num = Integer.parseInt(s[1])-1;
				stack[num].push(s[2]);
			}
			else if(s[0].equals("pop")){
				int num = Integer.parseInt(s[1])-1;
				String pre = stack[num].pop();
				list.add(pre);
			}
			else if(s[0].equals("move")){
				int num = Integer.parseInt(s[1])-1;
				String pre = stack[num].pop();
				int num2 = Integer.parseInt(s[2])-1;
				stack[num2].push(pre);
			}
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}