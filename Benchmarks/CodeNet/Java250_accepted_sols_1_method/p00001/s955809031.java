import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int value;
        for (int i = 0; i < 10; i++) {
            value = scan.nextInt();
            if (value <= 10000) {
                list.add(value);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(9));
        System.out.println(list.get(8));
        System.out.println(list.get(7));
    }
}