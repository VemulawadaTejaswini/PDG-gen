import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        int[] R1 = new int[26];
        int[] R2 = new int[26];

        Arrays.fill(R1, -1);
        Arrays.fill(R2, -1);

        int c1 = -1;
        int c2 = -1;
        for (int i = 0; i < S.length(); i++) {
            c1 = S.charAt(i) - 'a';
            c2 = T.charAt(i) - 'a';

            if (R1[c1] != -1 || R2[c2] != -1) {
                if (R1[c1] != c2 || R2[c2] != c1) {
                    System.out.println("No");
                    return;
                }
            } else {
                R1[c1] = c2;
                R2[c2] = c1;
            }
        }
        System.out.println("Yes");
    }
}
