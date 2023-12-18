import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 3; i++) numList.add(scanner.nextInt());
        Collections.sort(numList);
        StringBuilder strb = new StringBuilder();
        numList.forEach(s -> strb.append(s + " "));
        strb.delete(strb.length() - 1, strb.length());
        System.out.println(strb.toString());
    }
}