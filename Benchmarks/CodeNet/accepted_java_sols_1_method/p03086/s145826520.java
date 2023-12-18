import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        int ans = Arrays.stream(S.split("[^ACGT]"))
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(ans);
    }
}
