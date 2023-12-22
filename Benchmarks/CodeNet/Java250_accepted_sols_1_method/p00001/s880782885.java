import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.add(Integer.parseInt(scanner.next()));
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}