import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();

        List<String> result = new ArrayList<>();
        for (int i = x - (k - 1); i <= x + (k - 1); i++) {
            if (i >= -1000000 && i <= 1000000) {
                result.add(Integer.toString(i));
            }
        }

        System.out.println(String.join(" ", result));
    }
}
