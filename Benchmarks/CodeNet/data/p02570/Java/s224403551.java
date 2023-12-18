import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int D = scan.nextInt();
                int T = scan.nextInt();
                int S = scan.nextInt();
                
                if(S*T<D){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
                                         
        }
}