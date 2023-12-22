import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String ans = "No";
        for(int i=0;i<S.length();i++){
            StringBuilder sb = new StringBuilder();
            sb.append(S.substring(i,S.length()));
            sb.append(S.substring(0,i));
            if(T.equals(sb.toString())) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}