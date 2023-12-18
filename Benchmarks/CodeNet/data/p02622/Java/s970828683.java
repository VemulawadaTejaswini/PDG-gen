import java.util.*;
public class Main {
    public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String S = sc.next();		
      String T = sc.next();
      int swap = 0;
      
      int length = S.length();
      for(int i=0;i<length;i++){
      	String s = S.substring(i,i+1);
        String t = T.substring(i,i+1);
        
        if(!s.equals(t)){
          swap++;
        }          
      }
	  System.out.println(swap);
		
		
    }
}