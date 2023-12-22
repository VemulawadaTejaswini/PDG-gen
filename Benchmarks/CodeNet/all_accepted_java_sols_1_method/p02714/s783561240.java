import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String v = scan.next();
        char[] S = v.toCharArray();
        long rr = 0;
        long gg = 0;
        long bb = 0;

        for (int i = 0; i < S.length; i++) {
            if(S[i] == 'R'){
                rr++;
            }else if(S[i] == 'G'){
                gg++;
            }else{
                bb++;
            }
        }

        long cnt = rr*gg*bb;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int k = i + (i-j);
                if(k < n && S[k] != S[i] && S[i] != S[j] && S[j] != S[k]) cnt--;
            }
        }

        System.out.println(cnt <= 0 ? 0 : cnt);
    }
}
