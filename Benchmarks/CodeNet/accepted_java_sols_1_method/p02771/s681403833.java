import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        if (newList.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}