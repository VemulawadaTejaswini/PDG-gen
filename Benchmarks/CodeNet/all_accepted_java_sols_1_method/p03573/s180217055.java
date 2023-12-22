import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int inA = scan.nextInt();
        int inB = scan.nextInt();
        int inC = scan.nextInt();
        
        int ans;
        
        if(inA == inB){
            ans = inC;
        }else if(inA == inC){
            ans = inB;
        }else{
            ans = inA;
        }
 
        System.out.println(ans);
        
    }
}