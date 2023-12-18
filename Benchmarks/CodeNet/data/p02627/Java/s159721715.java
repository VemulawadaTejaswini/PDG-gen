import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String N = scan.next();
                
                if(Character.isUpperCase(N.charAt(0))){
                 System.out.println("A");       
                }else{
                    System.out.println("a");
                }
        }
}