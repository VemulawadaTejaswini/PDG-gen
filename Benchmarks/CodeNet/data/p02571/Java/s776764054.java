import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        long min_different = Long.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            long diff = 0;
            if (i + t.length() > s.length())
                break;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j))
                    diff++;
            }
            min_different = Math.min(min_different, diff);
        }

        sc.close();
        System.out.println(min_different);
    }
}
