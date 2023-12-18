import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] odd = sc.next().split("");
        String[] even = sc.next().split("");
        StringJoiner sj = new StringJoiner("");

        for (int i = 1; i <= odd.length + even.length; i++) {
            if (i % 2 == 0) {
                sj.add(even[i / 2 - 1]);
                continue;
            }
            sj.add(odd[i / 2]);
        }
        System.out.println(sj.toString());
    }

}
