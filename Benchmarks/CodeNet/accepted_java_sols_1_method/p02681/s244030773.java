import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        boolean judge = true;
        if(T.length() != S.length() + 1){
            judge = false;
        }
        
        for(int i =0; i<S.length(); i++){
            if(S.charAt(i) != T.charAt(i)){
                judge = false;
                break;
            }
        }
        
        if(judge == false){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}