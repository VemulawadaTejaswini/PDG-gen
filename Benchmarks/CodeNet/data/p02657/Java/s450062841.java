import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(new Main().run(sc));
        }
    }

    public String run(Scanner sc) {
        int[] vars = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
        return String.valueOf(vars[0] * vars[1]);
    }
}
