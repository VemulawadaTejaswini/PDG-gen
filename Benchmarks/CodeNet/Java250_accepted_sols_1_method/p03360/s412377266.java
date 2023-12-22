import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<Long> numbers = new PriorityQueue<>(3,Collections.<Long>reverseOrder());
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextLong());
        }
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            long max = numbers.poll();
            numbers.add(max*2);
        }

        long ans = 0;
        while (true){
            if (numbers.isEmpty()){
                break;
            }
            ans += numbers.poll();
        }
        System.out.println(ans);
        scanner.close();
    }
}
