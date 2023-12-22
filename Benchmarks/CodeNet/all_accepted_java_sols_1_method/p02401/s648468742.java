import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String op;
		Scanner scan = new Scanner(System.in);
		while(true){
			int a = scan.nextInt();
			op = scan.next();
		    int b = scan.nextInt();

		    if(op.equals("?")){
		    	break;
		    }

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
		}
	}

}