import java.util.Scanner;

public class Main {


    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	String op = scan.next();
    	int b = scan.nextInt();
    	while(op != "?"){
    		switch(op){
    			case "+" :
    				System.out.println((a + b));
    				break;
    			case "-" :
    				System.out.println((a - b));
    				break;
    			case "*" :
    				System.out.println((a * b));
    				break;
    			case "/" :
    				System.out.println((a / b));
    				break;
    		}
        	a = scan.nextInt();
        	op = scan.next();
        	b = scan.nextInt();
    	}
        scan.close();
    }
}