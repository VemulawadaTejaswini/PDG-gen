import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        String c = scanner.nextLine();
        int length = Integer.parseInt(c);
        
        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> s = Arrays.asList(numbers).stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        
        for (int aa = 0; aa<length; aa++) {
            int i = s.get(aa);
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            sum += i;
        }

        System.out.println(String.format("%d %d %d", min, max, sum));
    }
}
