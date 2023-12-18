import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();

        int res = 0;
        for (int i = 0; i < 1000; i++) {
            String T = String.format("%03d", i);

            int j = 0;
            for (int n = 0; n < S.length(); n++) {
                if(T.charAt(j) == S.charAt(n)) {
                    j++;
                }

                if (j >= 3) {
                    res++;
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
