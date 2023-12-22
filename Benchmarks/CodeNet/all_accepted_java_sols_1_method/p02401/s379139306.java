import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        while(true){
	        

	            int  a = sc.nextInt();
	            String op=sc.next();
	            int b=sc.nextInt();
	            
	            if(op.equals("?"))break;
	             int an=0;
	            switch(op) {
	            case"+":
	            	an=a+b;
	            	break;
	            case"-":
	            	an=a-b;
	            	break;
	            case"*":
	            	an=a*b;
	            	break;
	            case"/":
	            	an=a/b;
	            	break;
	            }
	            System.out.printf("%d\n",an);
	            }
	            sc.close();
	    }
	}
