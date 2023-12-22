import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int N = scan.nextInt();
      
      	if(N == 1){
        	System.out.println(1); 
        	return;
        }
      	
      	System.out.println(N * N * N);
       	
    }
}
