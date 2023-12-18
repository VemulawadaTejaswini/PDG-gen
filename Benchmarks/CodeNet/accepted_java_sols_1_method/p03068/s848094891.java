
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        char target = S.charAt(K - 1);
        String result="";
        for (int i = 0; i < N; i++) {
            if (!(S.charAt(i) == target)) {
                result+="*";
            }else{
                result+=String.valueOf(target);
            }
        }
        System.out.println(result);
    }
}
