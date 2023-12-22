import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
        sc.close();

        String p = S.substring(K-1,K);

        if(p.equals("A")){
            p = "a";
        }else if(p.equals("B")){
            p = "b";
        }else{
            p = "c";
        }

        System.out.println(S.substring(0, K-1)+p+S.substring(K, N));


    }
}
