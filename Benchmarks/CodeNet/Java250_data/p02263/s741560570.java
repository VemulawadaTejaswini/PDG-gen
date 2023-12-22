
import java.util.Scanner;
import java.util.*;

public class Main {
	
	public static Boolean isNumeric(String number) {
		try {
			Double.parseDouble(number);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] opArray = sc.nextLine().split(" ");
		Stack<Integer> st = new Stack<Integer>();
		int i = 0;
		while (i < opArray.length) {
			//System.out.println(opArray[i]);
			if(isNumeric(opArray[i])) {
				int inputInt = Integer.parseInt(opArray[i]);
				st.push(inputInt);
			}else if (opArray[i].equals("+")){
				int r1 = st.pop();
				
				int r2 = st.pop();
				
				st.push(r2 + r1);
				
			}else if (opArray[i].equals("-")) {
				int r1 = st.pop();
				
				int r2 = st.pop();
				st.push(r2 - r1);
			}else if(opArray[i].equals("*")) {
				int r1 = st.pop();
				
				int r2 = st.pop();
				st.push(r2 * r1);
			}else if(opArray[i].equals("/")) {
				int r1 = st.pop();
				
				int r2 = st.pop();
				st.push(r2 / r1);
			}
			i += 1;
		}
		

		sc.close();
		System.out.println(st.get(0));
	}
}

