import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String w = scan.next();

        char i;
        int count;
        boolean isBeautiful = true;
        
        if( w.length() % 2 != 0 )isBeautiful = false;
        
        else{
          
		 for( i = 'a' ; i <= 'z' ; i++){
           count = 0;
			for(char x: w.toCharArray()){
			   if(x == i)count++;
            }
           
           if( count % 2 != 0 )isBeautiful = false;
         }
          
        }
         
        if( isBeautiful )System.out.println("Yes");
        else System.out.println("No");
	  }
}