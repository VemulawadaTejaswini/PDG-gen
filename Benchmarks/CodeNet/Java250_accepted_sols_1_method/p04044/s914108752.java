import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();

        String ss[] = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = scan.next();
        }

        Arrays.sort(ss);
        for (int i = 0; i < n; i++) {
            System.out.print(ss[i]);
        }
    }
}
