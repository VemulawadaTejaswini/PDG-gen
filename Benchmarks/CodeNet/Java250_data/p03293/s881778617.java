import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().trim();
        String b = sc.next().trim();

        char[] left  = a.toCharArray();
        char[] right = b.toCharArray();

        boolean eq = false;

        for (int i = 0; i < left.length; i++) {
            if (equals(left, right)) {
                eq = true;
                break;
            } else {
                rotate(right);
            }
        }

        System.out.println((eq ? "Yes" : "No"));
    }

    private static void rotate(char[] ch) {
        char tmp = ch[0];

        for (int i = 0; i < ch.length - 1; i++) {
            ch[i] = ch[i + 1];
        }

        ch[ch.length - 1] = tmp;
    }

    private static boolean equals(char[] left, char[] right) {
        boolean res = true;

        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]) {
                res = false;
                break;
            }
        }

        return res;
    }
}