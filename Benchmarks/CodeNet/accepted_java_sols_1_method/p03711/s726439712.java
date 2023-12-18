import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        List<Integer> list = Arrays.asList(scanner.nextInt(), scanner.nextInt());
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> list2 = Arrays.asList(4, 6, 9, 11);
        List<Integer> list3 = Collections.singletonList(2);
        System.out.println(list1.containsAll(list) || list2.containsAll(list) || list3.containsAll(list) ? "Yes" : "No");
    }
}