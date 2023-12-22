import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 700;
        for(Character c:s)if(c=='o')ans+=100;
        System.out.println(ans);
    }
}
