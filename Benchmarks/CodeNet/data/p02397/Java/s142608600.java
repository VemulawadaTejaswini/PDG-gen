import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	  	Scanner scanner = new Scanner(System.in);
		int i = 0;
		int a;
		int b;
 		
		while(true){
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if(a == 0)
				if(b == 0)
					break;
			
			if(a <= b)
			    System.out.println(a + " " + b);
			else
			    System.out.println(b + " " + a);
        }
		scanner.close();
    }
}
