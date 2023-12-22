
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.parseInt(sc.next());
        sum += Integer.parseInt(sc.next());
        sum += Integer.parseInt(sc.next());
        if (sum > 21) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
        sc.close();
    }
}