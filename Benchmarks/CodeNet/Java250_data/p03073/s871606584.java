import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int count = 0;
        for (int i = 0 ; i < s.length ; i++) {
            if (i % 2 == 0) {
                if (s[i] == '0') {
                    count++;
                }
            } else {
                if (s[i] == '1') {
                    count++;
                }
            }
        }
        int count2 = 0;
        for (int i = 0 ; i < s.length ; i++) {
            if (i % 2 == 1) {
                if (s[i] == '0') {
                    count2++;
                }
            } else {
                if (s[i] == '1') {
                    count2++;
                }
            }
        }
        System.out.println(Math.min(count, count2));
    }

}
