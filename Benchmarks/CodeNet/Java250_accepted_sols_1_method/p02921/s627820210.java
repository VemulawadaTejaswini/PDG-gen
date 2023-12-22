import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();

        int ans = 0;
        if(s[0] == t[0]) ans++;
        if(s[1] == t[1]) ans++;
        if(s[2] == t[2]) ans++;

        System.out.println(ans);


        return;
    }
}