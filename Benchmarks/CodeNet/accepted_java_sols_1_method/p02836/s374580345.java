import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;

        char[] C = S.toCharArray();
        for(int i = 0; i < (C.length+1)/2; i++) {
            if(C[i] != C[C.length-i-1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}