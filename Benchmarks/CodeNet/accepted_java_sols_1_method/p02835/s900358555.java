import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(sc.next());
        }
        System.out.println(sum >= 22 ? "bust" : "win");
    }
}
