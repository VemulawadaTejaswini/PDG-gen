import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] alphabetCount = new int[26];


        /// S0
        char[] chars = sc.next().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 97;
            alphabetCount[index] = alphabetCount[index] + 1;
        }

        // S1 to Sn-1
        for (int i = 1; i < N; i++) {
            chars = sc.next().toCharArray();

            int[] tempAlphabetCount = new int[26];
            for (int j = 0; j < chars.length; j++) {
                int index = chars[j] - 97;
                tempAlphabetCount[index] = tempAlphabetCount[index] + 1;
            }
            for (int j = 0; j < 26; j++) {
                alphabetCount[j] = Math.min(tempAlphabetCount[j], alphabetCount[j]);
            }
        }

        String ans = "";
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > 0) {
                for (int j = 0; j < alphabetCount[i]; j++) {
                    ans += (char)(i + 97);
                }
            }
        }
        System.out.println(ans);
    }
}