import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt[] = new int[26];

        for(int i = 0; i < 26; i++) {
            cnt[i] = 0;
        }

        while(scan.hasNext()) {
            String str = scan.next();
            String[] s = str.split("");

            for(int i = 0; i < s.length; i++) {
                byte[] S = s[i].getBytes();

                if(S[0] != 45) {
                    if(65 <= S[0] && S[0] <= 90) {
                        S[0] += 32;
                    }
                    if(97 <= S[0] && S[0] <= 122) {
                        cnt[S[0] - 97] += 1;
                    }
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.println((char)(i + 97) + " : " + cnt[i]);
        }
    }
}
