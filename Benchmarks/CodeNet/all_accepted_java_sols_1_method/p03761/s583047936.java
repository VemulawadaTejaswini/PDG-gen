import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] S = new String[n];
        for(int i = 0; i < n ; i++) S[i] = sc.next();
        String res = "";
        Arrays.sort(S);
        for(char c : S[0].toCharArray()) {
            boolean flag = true;
            for(int i = 1; i < n; i++) {
                if(!S[i].contains(String.valueOf(c))) {
                    flag = false;
                    break;
                }
                int idx = S[i].indexOf(c);
                char[] t = S[i].toCharArray();
                t[S[i].indexOf(c)] = '.';
                S[i] = String.valueOf(t);
            }
            if(flag) res += c;
        }
        if(n == 1) res = S[0];
        char[] t = res.toCharArray();
        Arrays.sort(t);
        res = String.copyValueOf(t);
        System.out.println(res);
    }
}
