import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataCount = Integer.parseInt(scanner.nextLine());
        
        int[] data = new int[dataCount];
        
        for (int i = 0; i < dataCount; i++) {
            data[i] = Integer.parseInt(scanner.nextLine());
        }
        int profit = Integer.MIN_VALUE;
        int min = data[0];
        
        for (int i = 1; i < dataCount; i++) {
            profit = Math.max(profit, data[i] - min);
            min = Math.min(min, data[i]);
        }
        System.out.println(profit);
    }
}
