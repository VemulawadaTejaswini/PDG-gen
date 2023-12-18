import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int P = scanner.nextInt();
        scanner.close();

        int piece = A * 3 + P;

        int count = piece / 2;

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
