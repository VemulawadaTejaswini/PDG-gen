import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int X = sc.nextInt();
		  sc.close();
		  
		  if(X == 1) {
			  System.out.println("1");
		      System.exit(0);
		  }
		  
		  int answer = 1;
		  
		  for(int base = 2; base <= Math.sqrt(X); base++) {
			  int i = 2;
			  while(Math.pow(base, i) <= X) {
				  answer = Math.max(answer, (int)Math.pow(base, i));
				  i++;
			  }
		  }
		 
		  System.out.println(answer);
	      System.exit(0);
	    }
}