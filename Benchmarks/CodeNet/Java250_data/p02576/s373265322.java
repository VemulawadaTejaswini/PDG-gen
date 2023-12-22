import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int X = scan.nextInt();
                int T = scan.nextInt();               
                
                int minute = N/X;
                int amari = N%X;
                
                if(amari!=0){
                    System.out.println(T*minute+T);
                }else{
                   System.out.println(T*minute); 
                }
        }
}