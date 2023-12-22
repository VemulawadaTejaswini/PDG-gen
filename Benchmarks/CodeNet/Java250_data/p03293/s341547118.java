import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       String T = sc.next();
       if(T.equals(S)){
               System.out.println("Yes");
               return;
           }
       for(int i=0;i<S.length();i++){
           String U = S.substring(i,S.length())+S.substring(0,i);
           //System.out.println(U);
           if(T.equals(U)){
               System.out.println("Yes");
               return;
           }
       }
       System.out.println("No");
    }
}
