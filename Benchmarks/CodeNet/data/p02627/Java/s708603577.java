
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lower = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(lower.contains(sc.next()) ? 'a' : 'A');
    }
}
