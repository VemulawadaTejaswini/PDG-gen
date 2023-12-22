import java.util.*;
public class Main{
	public static void main(String args[]){
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		Set<String> ops = new HashSet<String>();
		ops.add("-");
		ops.add("+");
		ops.add("*");
		while(sc.hasNext()){
			String[] line = sc.nextLine().split(" ");
			for(int i=0;i<line.length;i++){
				String t =line[i];
				if(!ops.contains(t)){
					int val = Integer.parseInt(t);
					stack.push(val);
				}else{
					int val1 =stack.pop();
					int val2 = stack.pop();
					if(t.equals("+")){
						stack.push(val2+val1);
					}else if(t.equals("-")){
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