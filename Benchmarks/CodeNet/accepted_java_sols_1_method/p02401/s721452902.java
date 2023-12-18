import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a,b;
		String op=null;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			a=scan.nextInt();
			op=scan.next();
			b=scan.nextInt();	
			if(op.equals("?"))
				break;
			
			switch(op){
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);
					break;
			}
		}
	}
}
