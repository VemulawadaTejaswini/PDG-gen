import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String at = sc.next();
        String top = sc.next();
        
        String ans = "";
        
        if(at.equals("H")){
           ans = top;
        }else{
            if(top.equals("H")){
                ans = "D";
            }else{
                ans = "H";
            }
        }
         
        System.out.println(ans);
    }
}
