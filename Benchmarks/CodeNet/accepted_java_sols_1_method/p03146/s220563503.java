import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int s = new Scanner(System.in).nextInt();
        int i = 0;
        List<Integer> a = new ArrayList<>();
        for (int j = s; !a.contains(j); i++) {
            a.add(j);
            j = j % 2 == 0 ? j / 2 : j * 3 + 1;
        }
        System.out.println(i + 1);
    }
}