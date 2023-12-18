import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 1;
        char prev = s[0];
        for(int i = 1; i < s.length; i++){
            if(prev != s[i]){
                ans++;
                prev = s[i];
            }
        }
        System.out.println(ans-1);
    }
}