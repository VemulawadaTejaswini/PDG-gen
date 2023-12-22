import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            builder.append(i % 2 == 0 ? 0 : 1);
        }
        String[] pattern1 = builder.toString().split("");
        builder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            builder.append(i % 2 == 0 ? 1 : 0);
        }
        String[] pattern2 = builder.toString().split("");

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals(pattern1[i])) {
                count1++;
            }
            if (!s[i].equals(pattern2[i])) {
                count2++;
            }
        }

        System.out.println(Math.min(count1, count2));
    }
}