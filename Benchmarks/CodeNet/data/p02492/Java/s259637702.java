import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=0;
		int b=0;
		String op;
		while(scanner.hasNext()){
			a=scanner.nextInt();
			op=scanner.next();
			b=scanner.nextInt();
			
			if(op.equals("+")){
				System.out.println(a+b);
			}
			if(op.equals("-")){
				System.out.println(a-b);
			}
			if(op.equals("*")){
				System.out.println(a*b);
			}
			if(op.equals("/")){
				System.out.println(a/b);
			}
			if(op.equals("?")){
				break;
			}
		}

	}

}