import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int stuNum = scan.nextInt();
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 1; i < stuNum + 1; i++) {
            int s = scan.nextInt();
            int dis = stuNum - s;
            numMap.put(stuNum - dis, i);
        }
        for (int j = 1; j < numMap.size() + 1; j++) {
            System.out.printf("%d ", numMap.get(j));
        }
    }
}