import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String N = scan.next();
                
                if(N.equals("RRR")){
                    System.out.println(3);
                }else if(N.equals("RRS")|| N.equals("SRR")){
                    System.out.println(2);
                }else if(N.equals("SSS")){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
                
                                 
                
                
                
        }
}