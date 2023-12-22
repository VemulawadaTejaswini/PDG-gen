import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
      int nam = in.nextInt();
      int sum = in.nextInt();
      int cnt = 0;
      
      if(nam==0){
        if(sum==100){
           System.out.print(sum+1);    
        }else{
          System.out.print(sum);   
        }
      }
      else if(nam==1){
        if(sum==100){
           System.out.print(sum*100+100);    
        }else{
          System.out.print(sum*100);   
        }
      }
      else if(nam==2){
        if(sum==100){
           System.out.print(sum*10000+10000);    
        }else{
          System.out.print(sum*10000);   
        }
      }

	}
}