import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        String[] ss = S.split("");
        String target = ss[K-1];

        for (int i = 0; i < ss.length; i++) {
            if (!ss[i].equals(target)) {
                ss[i] = "*";
            }
        }

        System.out.println(String.join("", ss));
    }
}