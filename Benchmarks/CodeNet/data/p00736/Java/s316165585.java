import java.util.Scanner;

/** top-down syntax analysis (BNF) */
public class Main {
	private static int pos;
	private static int p;
	private static int q;
	private static int r;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String input = sc.nextLine();
			if(input.equals(".")) break;
			
			int count = 0;
			for(p = 0; p < 3; p++){
				for(q = 0; q < 3; q++){
					for(r = 0; r < 3; r++){
						pos = 0;
						int ret = formula(input);
						if(ret == 2) count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static int formula(String input){
		char c = input.charAt(pos++);
		
		if(c == '0') return 0;
		if(c == '1') return 1;
		if(c == '2') return 2;
		if(c == 'P') return p;
		if(c == 'Q') return q;
		if(c == 'R') return r;
		
		if(c == '-'){
			int ret = formula(input);
			return (2 - ret);
		}
		
		// c = '('
		int n1 = formula(input);
		boolean multi = (input.charAt(pos++) == '*');
		int n2 = formula(input);
		pos++;/*   next char   <-   c = ')' */
		if(multi){
			/* (2 * 2 = 2) , (1 * 1 = 1), (0 * 0 = 0) */
			if(n1 == n2) return n1;
			return 0;/* (0 * ? = 0) */
		}else{
			return Math.max(n1, n2);/* n1 + n2 */
		}
	}
}