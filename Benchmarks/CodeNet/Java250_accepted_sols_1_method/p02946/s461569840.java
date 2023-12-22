import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        StringJoiner sj = new StringJoiner(" ");
        for (int i = x - k + 1; i <= x + k - 1; i++) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj.toString());
    }

}
