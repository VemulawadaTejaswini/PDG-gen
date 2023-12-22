
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		String S[] = sc.nextLine().split(" ");
		int stack[] = new int[S.length];
		int idx = 0, a, b;  

		for(int i=0; i<S.length; i++){			
			try{
				int x = Integer.parseInt(S[i]);
				stack[idx++] = x;

			}catch(java.lang.NumberFormatException ex){
				b = stack[--idx];
				a = stack[--idx];

				switch (S[i]) {
					case "+":	stack[idx++] = a + b; break;
					case "-":	stack[idx++] = a - b; break;
					case "*":	stack[idx++] = a * b; break;
				}
			}
		}
		System.out.println(stack[--idx]);
	}	
}