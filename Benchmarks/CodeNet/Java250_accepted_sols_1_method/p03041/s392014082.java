import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();

        StringBuilder result = new StringBuilder(n);
        result.append(s.substring(0, k - 1));
        result.append(String.valueOf(s.charAt(k - 1)).toLowerCase());
        result.append(s.substring(k));
        System.out.println(result.toString());
    }
}
