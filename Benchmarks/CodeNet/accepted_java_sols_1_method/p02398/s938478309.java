import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] numbers = scanner.nextLine().split(" ");
        int s1 = Integer.parseInt(numbers[0]);
        int s2 = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        
        long count = IntStream.rangeClosed(s1, s2).filter(i -> c % i == 0).count();
        System.out.println(String.format("%d", count));
    }
}
