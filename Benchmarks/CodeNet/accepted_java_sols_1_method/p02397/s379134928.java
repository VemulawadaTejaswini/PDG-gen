import static java.lang.System.out;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            List<Integer> list = new ArrayList<>();
            list.add(scan.nextInt());
            list.add(scan.nextInt());

            if (list.get(0).equals(0) && list.get(1).equals(0)) {      
                break;
            }

            if (list.get(0) > list.get(1)) {
                int tmp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, tmp);
            }

            out.printf("%d %d%n", list.get(0), list.get(1));
        }
    }
}