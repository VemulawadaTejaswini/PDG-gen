import java.util.*;
  
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
     
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String S;
        int A, B;
        boolean answer = false;
      
        A = sc.nextInt();
        B = sc.nextInt();
        S = sc.next();
        
         String[] sol = S.split("-");
         if(sol.length != 2){
             System.out.println("No");
             return;
         }
         for(int k = 0; k<=1; k++){
             for(int i = 0; i<sol[0].length(); i++){
                 for(int j = 0; j<c.length; j++){
                    if(sol[0].charAt(i) == c[j])
                        answer = true;
                        continue;
                 }
             }
         }

        if(sol[0].length() != A || sol[1].length() != B || answer == false)
            System.out.println("No");
        
        else
            System.out.println("Yes");
     }
}