import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S,P;
        S = input.next();
        int n = S.length();
        P = input.next();
        boolean ans = false;
        S += S.substring(0,P.length()-1);
        for (int i = 0; i < n; i++){
            String tmp = S.substring(i,i+P.length());
            if (tmp.equals(P)){
                ans = true;
                break;
            }
        }
        if (ans){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
