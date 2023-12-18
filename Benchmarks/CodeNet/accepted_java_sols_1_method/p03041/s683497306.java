import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        System.out.println(s.substring(0, k - 1) + Character.toLowerCase(s.charAt(k - 1)) + s.substring(k, n));
    }
}
