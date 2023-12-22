import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int X = scan.nextInt();
                int Y = scan.nextInt();
                
                if(Y%2==1){
                    System.out.println("No");
                }else{
                    if(X*2<=Y && Y<=X*4){
                         System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
        }
}