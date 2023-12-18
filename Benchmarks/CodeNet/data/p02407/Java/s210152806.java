import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }
        Collections.sort(list, Collections.reverseOrder());
      

        for (Integer in : list) {
            System.out.print(in+" ");
        }

    }

}