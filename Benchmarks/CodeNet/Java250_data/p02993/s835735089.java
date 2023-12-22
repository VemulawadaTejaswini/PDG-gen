import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean T = true;
        for(int i = 0 ; i < S.length()-1 ; i++){
            if(S.substring(i, i+1).equals(S.substring(i+1, i+2))){
                System.out.println("Bad");
                T = false;
                break;
            }
            
        }
        if(T){
            System.out.println("Good");
        }

        sc.close();

    }

}
