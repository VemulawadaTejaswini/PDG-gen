import java.util.*;
public class Main {
	boolean isPlus(char chr) {
		return(chr == '+');
	}
	boolean isEqual(char chr) {
		return(chr == '=');
	}
	char toChar(int num) {
		String str = Integer.toString(num);
		return(str.toCharArray()[0]);
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			String input = stdIn.next();
			int start = 0, count = 0;
			if(input.charAt(0) == 'X') start++;
			else {
				for(int r = 0;r < input.length(); r++) {
					if(isPlus(input.charAt(r)) || isEqual(input.charAt(r))) {
						if(input.charAt(r + 1) == 'X') {start++;break;}
					}
				}
			}
			for(int r = start; r <= 9; r++) {//可能性を試す
				char[] temp = input.toCharArray();
				Stack<Integer> stack = new Stack<Integer>();
				String num = "";
				for(int c = 0; c < temp.length; c++) {
					if(isPlus(temp[c])) {
						if(!stack.isEmpty()) {
							int before = stack.pop();
							stack.push(before + (Integer.parseInt(num)));
						} else stack.push(Integer.parseInt(num));
						num = "";
						continue;
					} else if(isEqual(temp[c])) {
						int before = stack.pop();
						stack.push(before + Integer.parseInt(num));
						num = "";
						continue;
					}
					if(temp[c] == 'X') temp[c] = toChar(r);
					num += temp[c];
				}
				if(stack.pop() == Integer.parseInt(num)) count = num.charAt(0) - '0';
			}
			System.out.println((count == 0) ? "NA" : count);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}