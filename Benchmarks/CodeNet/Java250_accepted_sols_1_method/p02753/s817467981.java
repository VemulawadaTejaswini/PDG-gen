import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        char [] A = new char[S.length()];
        
        for(int i=0;i<S.length();i++){
        A[i] = S.charAt(i);
        }
        
        if(A[0] == A[1] && A[1] == A[2]){
            System.out.println("No");
        }
        
        else{
            System.out.println("Yes");
        }
        
    }
}