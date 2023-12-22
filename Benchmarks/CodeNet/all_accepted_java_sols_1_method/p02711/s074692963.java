import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        if (s.charAt(0) == '7' || s.charAt(1) == '7' ||  s.charAt(2) == '7') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}