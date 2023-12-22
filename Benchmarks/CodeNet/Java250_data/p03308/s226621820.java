import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        int min = list.stream().min(Comparator.naturalOrder()).get();
        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max-min);
    }
}