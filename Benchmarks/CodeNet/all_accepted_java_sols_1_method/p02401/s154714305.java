import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	StringBuilder sa = new StringBuilder();
    	while(true){

    		int a = sc.nextInt();
    		String op = sc.next();
    		int b = sc.nextInt();
    		if(op.equals("?")){
    			break;
    		}else{
    	        if(op.equals("+")){
    	        	int i = a+b;
	                sb.append(i).append("\n");
    	        }
                if(op.equals("-")){
                	int i = a-b;
	                sb.append(i).append("\n");
    	        }
                if(op.equals("*")){
                	int i = a*b;
	                sb.append(i).append("\n");
    	        }
                if(op.equals("/")){
	                  int i = a/b;
	                  sb.append(i).append("\n");
                }
    		}
    	}
    	System.out.print(sb);
    }

}