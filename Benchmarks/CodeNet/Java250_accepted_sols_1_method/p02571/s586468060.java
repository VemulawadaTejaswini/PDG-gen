import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String T = s.next();
        char[] SS = S.toCharArray();
        char[] TT = T.toCharArray();
        int count = T.length();

        for (int i = 0; i < T.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                int n = i;
                if (TT[i] == SS[j]) {
                    for (int k = 0; k < T.length() - i; k++) {
                        if(j + k >= S.length()){
                            n = count;
                            break;
                        }
                        if (TT[i + k] != SS[j + k]) n++;
                    }
                    if (n < count) count = n;
                }
            }
        }

        System.out.println(count);
    }
}