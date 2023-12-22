import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            answer.append(s[i]);
            answer.append(t[i]);
        }

        System.out.println(answer);
    }
}
