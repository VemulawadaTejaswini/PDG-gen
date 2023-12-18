import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		int[] stack = new int[1001];
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				String str = sc.next();
				if(str.charAt(0) == '+') {
					stack[i-2] += stack[i-1];
					i--;
				}
				else if(str.charAt(0) == '-') {
					stack[i-2] -= stack[i-1];
					i--;
				}
				else if(str.charAt(0) == '*') {
					stack[i-2] *= stack[i-1];
					i--;
				}
				else {
					stack[i] = Integer.parseInt(str);
					i++;
				}
			}
		}
        System.out.println(stack[0]);
	}	
}

