import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String S = scan.next();
                String T = scan.next();
                
                
                
            if(T.equals(S+T.substring(T.length()-1))){
                System.out.println("Yes");
            }
            
            else{
                 System.out.println("No");
            }
        
        }
}