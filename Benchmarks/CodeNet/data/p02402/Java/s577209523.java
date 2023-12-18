import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	boolean J = true;
	  	int a = 0;
	  	
	  	while(J) {
	  		
		  	int  x = scanner.nextInt();			//入力
		  	String s = scanner.next();
		  	int  y = scanner.nextInt();
	  		
		  	switch(s){
		  	case "+":
		  		System.out.println(x + y);
		  		break;
		  	case "-":
		  		System.out.println(x - y);
		  		break;
		  	case "*":
		  		System.out.println(x * y);
		  		break;
		  	case "/":
		  		System.out.println(x / y);
		  		break;
		  	case "?":
		  		a = 1;
			  	break;
			default:
			  	break;
		  	}

		  	if(a == 1)
		  		break;
		  	
  		}
        scanner.close();
  }
}
