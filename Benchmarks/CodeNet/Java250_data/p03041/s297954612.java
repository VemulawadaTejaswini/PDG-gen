import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] s = S.split("");
        s[K-1] = s[K-1].toLowerCase();
        String ans = "";
        for(int i = 0; i < N; i++) {
            ans += s[i];
        }

        System.out.println(ans);
    }
}