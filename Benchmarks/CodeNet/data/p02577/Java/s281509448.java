import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String N = scan.next();
                int sum = 0;
                
                for(int i=0; i<N.length(); i++){
                    char p = N.charAt(i);
                    int j = (int)p;
                    
                    sum += j;
                }
                
                if(sum%3==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
        }
}