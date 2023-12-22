import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int a = 0;
        int z = 0;
        for (a = 0; a < s.length(); a++) {
            if (s.charAt(a) == 'A') break;
        }
        for (z = s.length() - 1; z >= 0; z--) {
            if (s.charAt(z) == 'Z') break;
        }
        System.out.println(z - a + 1);
    }
}