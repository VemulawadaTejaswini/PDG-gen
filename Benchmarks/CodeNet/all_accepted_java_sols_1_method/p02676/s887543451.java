import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        int len = S.length();
        if(K >= len){
            System.out.println(S);
        }else{
            System.out.println(S.substring(0,K) + "...");
        }
    }
}
