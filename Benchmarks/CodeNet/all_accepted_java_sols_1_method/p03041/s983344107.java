import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();

        System.out.println(s.substring(0, k - 1) + s.valueOf(s.charAt(k - 1)).toLowerCase() + s.substring(k));
    }
}
