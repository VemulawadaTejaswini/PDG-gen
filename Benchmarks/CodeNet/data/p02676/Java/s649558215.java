import java.util.*;

public class Main {

    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();

        if(K >= S.length()){
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}