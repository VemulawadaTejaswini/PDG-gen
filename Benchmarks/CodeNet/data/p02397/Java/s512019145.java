import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numList = new ArrayList<>();
        while (true) {
            String x = scanner.next();
            String y = scanner.next();
            if (x.equals("0") && y.equals("0")) {
                break;
            } else {
                numList.add(y + " " + x);
            }
        }
        for (String aa: numList) {
                System.out.println(aa);
        }
//        numList.forEach(s -> System.out.println(s));
    }
}