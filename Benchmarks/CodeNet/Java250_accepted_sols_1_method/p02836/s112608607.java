import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int symmetric = s.length -1;
        int count = 0;
        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[symmetric]) {
                count++;
            }
            symmetric--;
        }

        System.out.println(count);
    }
}
