import java.util.*;

public class Main{

     public static void main(String []args){
        String S , A;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        A = S.substring(0,4);
        if(A.equals("2018") == false){
           S = S.replace(A, "2018");
        } 
        System.out.println(S);
     }
}