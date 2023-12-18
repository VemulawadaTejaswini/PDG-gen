import java.util.*;

public class SOLVE{
 
  public static void main(String args[]){
   
    Scanner s = new Scanner(System.in);
    String st = s.nextLine();
    
    int cnt = 0;
    
    for(int i = 0; i < st.length(); i++){
    	
     	if(st.charAt(i) == 'R')
          cnt += 1;
      	else
          if(cnt != 0)
            break;
      
    }  
    
    System.out.println(cnt);
    
  }
  
}