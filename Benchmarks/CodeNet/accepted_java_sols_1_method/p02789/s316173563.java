import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pattern = scanner.nextInt();
        int ac = scanner.nextInt();
        String result = "";
        if (pattern == ac) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }
}
