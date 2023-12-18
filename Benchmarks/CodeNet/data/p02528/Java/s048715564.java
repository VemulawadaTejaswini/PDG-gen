import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
          
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        
        for (int i = 0; i < n-1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers[n-1]);
    }
}