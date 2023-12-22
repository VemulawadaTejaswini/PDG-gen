import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = sc.next().split("");
        s[k - 1] = s[k - 1].toLowerCase();
        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < n; i++) {
            sj.add(s[i]);
        }
        System.out.println(sj.toString());
    }

}
