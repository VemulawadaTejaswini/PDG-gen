import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) list.add(sc.nextInt());

        List<Integer> sorted = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println((sorted.get(1)-sorted.get(0)) + (sorted.get(2)-sorted.get(1)));
    }
}
