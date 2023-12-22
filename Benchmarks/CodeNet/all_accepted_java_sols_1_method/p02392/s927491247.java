import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int t;
        System.out.println(s.nextInt() < (t = s.nextInt()) && t < s.nextInt() ? "Yes" : "No");
    }
}