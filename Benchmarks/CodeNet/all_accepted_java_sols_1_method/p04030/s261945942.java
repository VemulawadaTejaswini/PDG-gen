import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        List<String> result = new ArrayList<>();
        for (String key : s) {
            if ("B".equals(key)) {
                if (!result.isEmpty()) {
                    result.remove(result.size() - 1);
                }
            } else {
                result.add(key);
            }
        }

        System.out.println(String.join("", result));
    }
}
