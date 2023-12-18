import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int alice = sc.nextInt();
        int bob = sc.nextInt();
        
        String ans = "";
        
        if(alice < bob){
            if((alice == 1) &&(bob == 13)){
                ans = "Alice";
            }else{
                ans = "Bob"; 
            }
            
        }else if(alice == bob){
            ans = "Draw";
        }else{
            if((bob == 1) &&(alice == 13)){
                ans = "Bob";
            }else{
                ans = "Alice"; 
            }
        }
        System.out.println(ans);
	}
}