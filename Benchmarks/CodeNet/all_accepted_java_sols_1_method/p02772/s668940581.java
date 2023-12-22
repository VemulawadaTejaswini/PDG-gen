import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
		int namber = 0;
		int flag = 0;

		for(long i = 0; i < nam; i++){
		   namber =  in.nextInt();
		   if(namber % 2 == 0){
		        flag = 1;
		       if(namber % 3 == 0 || namber % 5 == 0 ){
		           flag = 0;
		       }
		       if(flag == 1){
		           System.out.println("DENIED");
		           System.exit(0);
		       }
		   }
		}
      
      System.out.println("APPROVED");
	}
}