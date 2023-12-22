import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        List<Integer> list = new ArrayList<>();
        list.add(a + b);
        list.add(a - b);
        list.add(a * b);

        int max = list.parallelStream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}