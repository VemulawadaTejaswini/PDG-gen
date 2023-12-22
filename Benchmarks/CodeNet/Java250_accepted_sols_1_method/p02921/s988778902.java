import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
		
      	String s = sc.next();
      	String t = sc.next();

      int hit = 0;
      for(int i = 0; i < s.length(); i++){
         	char c1 = s.charAt(i); 
      		  char c2 = t.charAt(i); 
          	if(c1 == c2){
  				hit++;            
            }
        }
      
      	System.out.println(hit);
    }
}
