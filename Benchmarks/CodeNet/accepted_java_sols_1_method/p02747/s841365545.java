import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean judge = true;
        
        if(S.length()%2 == 1){
            judge = false;
        }
        
        else{
        for(int i =0; i<S.length(); i=i+2){
            if(S.charAt(i) == 'h' && S.charAt(i+1) == 'i'){
                continue;
            }
            
            else{
                judge = false;
                break;
            }
        }
        }
        
        if(judge == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}