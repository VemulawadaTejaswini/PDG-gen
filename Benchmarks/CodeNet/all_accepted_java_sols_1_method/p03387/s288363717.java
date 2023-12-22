import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int a = Integer.valueOf(inputs[0]);
        int b = Integer.valueOf(inputs[1]);
        int c = Integer.valueOf(inputs[2]);
      	int max = 0;
      	int restNum1 = 0;
      	int restNum2 = 0;
    
      	if(a>=b) {
        	max = a;
          	restNum1 = b;
          	restNum2 = c;
        }
        else {
          max = b;
          restNum1 = a;
          restNum2 = c;
      	}
      
      	if(c>=max) {
        	max= c;
          	restNum1 = a;
          	restNum2 = b;
        }
      
      int diff1 = max -restNum1 ;
      int diff2 = max -restNum2 ;
      int answer= 0;
 		if( (diff1%2==0 && diff2%2==1) || (diff1%2==1 && diff2%2==0) )
        {
           answer = ((diff1+diff2+1)/2) + 1;
        }
        else {
      	   answer = (diff1+diff2)/2;
        }
      	
      	System.out.println(answer);
          
    }
        
}