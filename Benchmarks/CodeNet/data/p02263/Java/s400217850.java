import java.util.*;
public class Main {
	
	public static Integer revPol(String s) {
		
		String[] notation = s.split(" ");
		Stack<Integer> workS = new Stack<>();
		ArrayList<String> operations = new ArrayList<>();
		operations.add("+");
		operations.add("-");
		operations.add("*");
		operations.add("/");
		for(String current : notation) {
			//System.out.println(workS);
			if(operations.contains(current)) {
				//System.out.println("Operation");
				int toAdd = 0;
				int val1 = workS.pop();
				int val2 = workS.pop();
				if(current.equals("+")) {
					toAdd = val1 + val2;
				}
				else if(current.equals("-")) {
					toAdd = val2 - val1;
				}
				else if(current.equals("*")) {
					toAdd = val1 * val2;
				}
				
				
				workS.push(toAdd);
			}
			else {
				workS.push(Integer.parseInt(current));
			}
		}
		
		return workS.pop();
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		System.out.println(revPol(inp));
		s.close();
		
	}

}

