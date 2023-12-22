import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int M = 55555;
		  int N = sc.nextInt();
		  sc.close();
		  int[] prime = new int[M + 1];
		  prime[0] = 1;
		  prime[1] = 1;
		  for(int i = 2; i <= Math.sqrt(M); i++) {
			  if(prime[i] == 0) {
				  int j = i + i;
				  while(j <= M) {
					  prime[j] = 1;
					  j += i;
				  }
			  }
		  }
	      
		  String answer = "";
		  int count = N;
		  
		  for(int i = 2; i <= M; i++) {
			  if(prime[i] == 0 && i % 5 == 1) {
				  answer += (i + " ");
				  count--;
			  }
			  if(count == 0) {
				  break;
			  }
		  }
		  
	    	  System.out.println(answer);  
	      System.exit(0);
	    }
}