import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int ans = 0;
        for(Character c:arr){
            if(c=='+')ans++;
            else ans--;
        }
        System.out.println(ans);
    }
}
