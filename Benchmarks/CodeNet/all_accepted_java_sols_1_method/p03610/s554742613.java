import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        StringJoiner sj = new StringJoiner("");
        for (int i = 1; i <= s.length; i++) {
            if (i % 2 == 1) {
                sj.add(s[i - 1]);
            }
        }
        System.out.println(sj.toString());
    }

}
