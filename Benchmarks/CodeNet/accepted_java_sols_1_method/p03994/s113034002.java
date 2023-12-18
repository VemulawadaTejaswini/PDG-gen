import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int K = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; ++i) {
            char cur = str.charAt(i);
            if (cur != 'a') {
                int ops = 'z' - cur + 1;
                if (ops <= K) {
                    K -= ops;
                    sb.append('a');
                } else {
                    sb.append(cur);
                }
            } else {
                sb.append('a');
            }
        }

        char last = str.charAt(str.length() - 1);
        while (K > 0) {
            last++;
            if (last > 'z') {
                last = 'a';
            }
            K--;
        }
        sb.append(last);
        System.out.println(sb.toString());
    }
}