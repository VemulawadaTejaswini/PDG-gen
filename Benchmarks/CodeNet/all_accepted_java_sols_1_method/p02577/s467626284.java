import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String N = s.next();
        char[] chars = N.toCharArray();
        int n = 0;
        for (char aChar : chars) n += (aChar - 48);
        if (n % 9 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}