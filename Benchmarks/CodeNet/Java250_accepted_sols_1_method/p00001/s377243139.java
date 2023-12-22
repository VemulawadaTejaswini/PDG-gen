import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }

}