import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer k = Integer.parseInt(scanner.next());
        Integer total = Integer.parseInt(scanner.next());
        Integer gohyakuen = 500;

        if (gohyakuen*k >= total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}