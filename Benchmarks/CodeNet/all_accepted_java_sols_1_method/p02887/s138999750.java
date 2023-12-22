import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        char[] c = new char[N];
        for(int i = 0; i < N; i++){
            c[i] = S.charAt(i);
        }
        int ans = 0;
        for(int i = 0; i < N - 1; i++){
            if(c[i] != c[i+1]) ans++;
        }

        System.out.println(ans+1);
    }
}