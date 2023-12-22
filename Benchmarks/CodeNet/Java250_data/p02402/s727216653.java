import java.util.*;

/**
 * Created by khrom on 2017/06/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            numList.add(scanner.nextInt());
        Collections.sort(numList);
        long sum = 0;
        for (Integer integer : numList)
            sum += integer;
        System.out.println(numList.get(0) + " " + numList.get(numList.size() - 1) + " " + sum);
    }
}