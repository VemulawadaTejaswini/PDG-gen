import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        int count = 0;
        for (char c : s) {
            if (c == 'o') {
                count++;
            }
        }

        count += 15 - s.length;

        if (count >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}