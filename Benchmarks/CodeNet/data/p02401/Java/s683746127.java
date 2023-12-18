import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	String op = scan.next();
    	int b = scan.nextInt();

    	
    	if(op.equals("+")){
    	System.out.printf("%d%c",a+b,10);
    		}
    	else if(op.equals("-")){
        	System.out.printf("%d%c",a-b,10);
        	}
    	else if(op.equals("^")){
        	System.out.printf("%d%c",a*b,10);
        	}
    	else if(op.equals("/")){
        	System.out.printf("%d%c",a/b,10);
        	}
    	else if(op.equals("?")){
        	return;
        	}	
    }	
}