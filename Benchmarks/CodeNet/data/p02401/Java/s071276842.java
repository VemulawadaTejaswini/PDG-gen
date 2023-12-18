
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			int a = Integer.parseInt(sc.next());
			String op = sc.next();
			int b = Integer.parseInt(sc.next());
			
			if(op.equals("?")){
				break;
			}
			
			int answer = culculateValues(op,a,b);
			System.out.println(answer);
			
		}
		
		sc.close();
		
	}

	private static int culculateValues(String op, int a, int b) {
		
		int answer = 0;
		
		switch(op){
		
		case "+":
			answer = a + b;
			break;
		case "-":
			answer = a - b;
			break;
		case "*":
			answer = a * b;
			break;
		case "/":
			answer = a / b;
			break;
		
		}
		
		return answer;
	}
}

