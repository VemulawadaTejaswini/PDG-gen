import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        String end = T.substring(S.length(),S.length()+1);
        if(T.equals(S+end)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
