import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
      long nam = in.nextLong();
      int cnt = String.valueOf( nam ).length();
      int sum = 0;
      
      long memo = nam;
      for(int i = 0;i < cnt;i++){
      		sum += memo%10;
        	memo /=10;
      }
      
      if(nam%sum==0){
         System.out.print("Yes"); 
      }else{
         System.out.print("No");
      }
      

      

	}
}