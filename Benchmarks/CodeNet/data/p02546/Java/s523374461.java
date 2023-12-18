import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String S = scan.next();
                
                char t = S.charAt(S.length()-1);
                
                if(t=='s'){
                    System.out.println(S+"es");
                }else{
                    System.out.println(S+"s");
                }

        }
}