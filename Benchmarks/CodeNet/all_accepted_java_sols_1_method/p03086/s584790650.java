import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        char[] cs = {'A', 'C', 'G', 'T'};
        int count = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            boolean continuous = false;
            for (char c : cs) {
                if (t == c) {
                    current++;
                    continuous = true;
                }
            }
            if (!continuous) {
                count = Math.max(count, current);
                current = 0;
            }
        }

        if (current != 0) {
            count = Math.max(count, current);
        }

        System.out.println(count);
    }
}
