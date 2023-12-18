import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String ans = t.replaceAll("\\?", "D");
        System.out.println(ans);
    }
}
