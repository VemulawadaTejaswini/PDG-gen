import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();

        if (s.length <= k) {
            System.out.println(s);
        } else {
            System.out.println(new String(Arrays.copyOf(s, k)) + "...");
        }
    }
}