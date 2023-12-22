import java.util.*;

public class Main{
	public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();
      int B = sc.nextInt();
   	  int C = sc.nextInt();
      int X = sc.nextInt();
      
      int y = 0;
      int count = 0;
      for(int i=0; i <= A ; i++){
      	for(int j=0; j <= B; j++){
        	y = (X-500*i-100*j)/50;
            if(y >= 0 && y <= C){
            	count = count+1;
            }
               
        }
      }
	System.out.println(count);
    }
}
