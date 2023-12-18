import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer groupA[] = {1, 3, 5, 7, 8, 10, 12};
        Integer groupB[] = {4, 6, 9, 11};
        Integer groupC[] = {2};
        int x = scanner.nextInt(), y = scanner.nextInt();

        if ((Arrays.asList(groupA).contains(x) && Arrays.asList(groupA).contains(y)) ||
                (Arrays.asList(groupB).contains(x) && Arrays.asList(groupB).contains(y)) ||
                (Arrays.asList(groupC).contains(x) && Arrays.asList(groupC).contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
