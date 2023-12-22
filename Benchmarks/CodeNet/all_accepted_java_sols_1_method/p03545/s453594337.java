import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] carr = S.toCharArray();
        int bitSign = 0;
        while (bitSign < 8) {
            int sign1 = (bitSign >>> 2) & 0x1;
            int sign2 = (bitSign >>> 1) & 0x1;
            int sign3 = bitSign & 0x1;

            int result = 0;
            result += (carr[0] - 48);
            result += ((sign1 == 0) ? (carr[1] - 48) : -(carr[1] - 48));
            result += ((sign2 == 0) ? (carr[2] - 48) : -(carr[2] - 48));
            result += ((sign3 == 0) ? (carr[3] - 48) : -(carr[3] - 48));
            if (result == 7) {
                char s1 = sign1 == 0 ? '+' : '-';
                char s2 = sign2 == 0 ? '+' : '-';
                char s3 = sign3 == 0 ? '+' : '-';
                StringBuilder sb = new StringBuilder();
                sb.append(carr[0]).append(s1).append(carr[1]).append(s2).append(carr[2]).append(s3).append(carr[3]).append("=7");
                System.out.println(sb.toString());
                return;
            }
            bitSign++;
        }
        //System.out.println(0);
    }
}
