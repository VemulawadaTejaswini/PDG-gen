import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(;;){
			int a = s.nextInt();
			String op = s.next();
			int b = s.nextInt();
		
			if(op.equals("?"))
				break;
			
			if(op.equals("+"))
				System.out.println(a + b);
			if(op.equals("-"))
				System.out.println(a - b);
			if(op.equals("*"))
				System.out.println(a * b);
			if(op.equals("/"))
				System.out.println(a / b);				
		}
	}
}