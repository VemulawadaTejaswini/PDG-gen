import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String S = scn.nextLine();
        int N = S.length();
        
        String str_before = S.substring(0,(N-1)/2);
        String str_after = S.substring((N+2)/2,N);
        StringBuffer hoge = new StringBuffer(str_before);
        String str = hoge.reverse().toString();
        if(str_after.equals(str) && str_after.equals(str_before)) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
