import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String S = sc.next();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int iin = S.indexOf(String.valueOf(i));
            if (iin == -1) {
                continue;
            }
            for (int j = 0; j < 10; j++) {
                int jin = S.substring(iin+1).indexOf(String.valueOf(j));
                if (jin == -1) {
                    continue;
                }
                for (int k = iin+jin+2; k < N; k++) {
                    set.add(S.substring(iin,iin+1) + S.substring(iin+jin+1,iin+jin+2) + S.substring(k,k+1));
                }
            }
        }
        System.out.println(set.size());
    }
}