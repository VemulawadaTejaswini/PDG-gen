import java.util.Scanner;

public class Main {
    public static int distance(String s1, String s2, int i, int j) {
        if (j == s2.length()) {
            return s1.length() - i;
        }
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return distance(s1, s2, i + 1, j + 1);
        }
        int rep = distance(s1, s2, i + 1, j + 1) + 1;
        return rep;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dist = distance(in.next(), in.next(), 0, 0);
        System.out.println(dist);

    }

}