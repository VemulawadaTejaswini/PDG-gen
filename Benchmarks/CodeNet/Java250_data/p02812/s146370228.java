import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (s.substring(i, i + 3).equals("ABC")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
