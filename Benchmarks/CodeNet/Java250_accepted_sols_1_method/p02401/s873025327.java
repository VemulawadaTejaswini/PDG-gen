import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> answers = new ArrayList<Integer>();
		for(;;){
			int a = scan.nextInt();
			String op = scan.next();
			char o = op.charAt(0);
			int b = scan.nextInt();
			if(o == '?'){
				break;
			}
			int ans = 0;
			switch(o){
				case '+' :
					ans = a + b;
					break;
				case '-' :
					ans = a - b;
					break;
				case '*' :
					ans = a * b;
					break;
				case '/' :
					ans = a / b;
					break;
				default :
					break;
			}
			answers.add(ans);
		}

		for(int an : answers){
			System.out.printf("%d\n", an);
		}
	}
}