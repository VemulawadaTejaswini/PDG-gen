import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static final String plus = "+";
	public static final String minus = "-";
	public static final String kake = "*";
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String strInt = null;
		int intStr = 0;
		int numInt1 = 0;
		int numInt2 = 0;
		int total = 0;
		List<Integer> stack = new ArrayList<Integer>(100);
		while(sc.hasNext()){
			strInt = sc.next();
			if(strInt.equals(plus)){
				numInt2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				numInt1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				total = numInt1 + numInt2;
				stack.add(total);
			}else if(strInt.equals(minus)){
				numInt2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				numInt1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				total = numInt1 - numInt2;
				stack.add(total);
			}else if(strInt.equalsIgnoreCase(kake)){
				numInt2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				numInt1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				total = numInt1 * numInt2;
				stack.add(total);
			}else{
				intStr = Integer.parseInt(strInt);
				stack.add(intStr);
			}
		}
		total = stack.get(stack.size() - 1);
		System.out.println(total);
	}
}