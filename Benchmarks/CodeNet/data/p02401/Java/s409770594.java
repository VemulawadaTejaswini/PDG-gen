import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String op = scanner.nextLine();
		int b = scanner.nextInt();
		
		for(;;){		
			if ( op.equals("+")){
				 System.out.println(a+b);
			} 
			else if ( op.equals("-")){
				 System.out.println(a-b);
		    } 
		    else if ( op.equals("*")){
				 System.out.println(a*b);
		    } 
			else if ( op.equals("/")){
				 System.out.println(a/b);
		    } 
   		    else {
				break;
			}	
	    }
	}
}