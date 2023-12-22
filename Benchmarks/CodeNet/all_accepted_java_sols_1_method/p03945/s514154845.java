import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] c = s.toCharArray();
        boolean isWhite = false;

        int count = 0;
        if (c[0] == 'W')
            isWhite = true;

        for (int i = 1; i < c.length; i++) {
            if (isWhite && c[i] == 'B') {
                count++;
                isWhite = !isWhite;
            } else if (!isWhite && c[i] == 'W') {
                count++;
                isWhite = !isWhite;
            }
        }

        System.out.println(count);
        sc.close();
    }
}