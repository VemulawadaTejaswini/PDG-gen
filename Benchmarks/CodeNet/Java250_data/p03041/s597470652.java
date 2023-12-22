import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        char s = S.charAt(K-1);
        String sn = String.valueOf(s);
        if(sn.equals("A")){
            sn = "a";
        }
        else if(sn.equals("B")){
            sn = "b";
        }
        else if(sn.equals("C")){
            sn = "c";
        }

        if(K==1){
            System.out.println(sn + S.substring(1));
        }
        else if(K==2){
            System.out.println(S.charAt(0) + sn + S.substring(2));
        }
        else if(K>=3){
            System.out.println(S.substring(0, K-1) + sn + S.substring(K));
        }
    }
}