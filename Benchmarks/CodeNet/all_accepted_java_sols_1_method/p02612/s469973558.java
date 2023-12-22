import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
               
                while(N>1000){
                    N = N-1000;
                }
                
                System.out.println(1000-N);               
        }               
}