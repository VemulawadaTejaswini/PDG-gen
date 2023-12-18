import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        System.out.println(s.length() <= k ? s : s.substring(0, k) + "...");
    }
}
