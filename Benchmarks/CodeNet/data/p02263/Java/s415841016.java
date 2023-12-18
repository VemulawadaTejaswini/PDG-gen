import java.util.*;
public class Main{
	public static void main(String args[]){
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Character> ops = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] line = sc.nextLine().split(" ");
			for(int i=0;i<line.length;i++){
				char t =line[i].charAt(0);
				if(t>='0' && t<='9'){
					int val = Integer.parseInt(String.valueOf(t));
					stack.push(val);
				}else{
					int val1 =stack.pop();
					int val2 = stack.pop();
					if(t=='+'){
						stack.push(val2+val1);
					}else if(t=='-'){
						stack.push(val2-val1);
					}else{
						stack.push(val2*val1);
					}
				}
			}
			System.out.println(stack.peek());
		}
	}

}