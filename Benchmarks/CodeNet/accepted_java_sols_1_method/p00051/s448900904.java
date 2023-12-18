import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            char[] m = sc.next().toCharArray();
            Arrays.sort(m);
            char[] l = new char[m.length];
            for (int i = m.length - 1; i >= 0; i--) {
                l[m.length - i - 1] = m[i];
            }
            System.out.println(Integer.parseInt(String.valueOf(l)) - Integer.parseInt(String.valueOf(m)));
        }
    }
}
