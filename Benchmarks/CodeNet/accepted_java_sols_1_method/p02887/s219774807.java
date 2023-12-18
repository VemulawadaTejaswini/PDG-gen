import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ans = 0;
        char prev = '0';
        for(char c : s){
            if(prev != c){
                ans++;
            }
            prev = c;
        }
        System.out.println(ans);
    }
}