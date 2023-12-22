import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("ACGT".contains(s.substring(i, i + 1))) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        max = Math.max(count, max);

        System.out.println(max);
    }
}
