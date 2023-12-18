
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s_ = sc.next();
        System.out.println((s_.substring(0, s_.length()-1)).equals(s) ? "Yes" : "No");
    }
}
