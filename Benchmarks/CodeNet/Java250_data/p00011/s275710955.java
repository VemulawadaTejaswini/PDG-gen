import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int[] numbers = new int[w];
        
        for (int i = 0; i < w; i++) {
            numbers[i] = i+1;
        }
        
        for (int i = 0; i < n; i++) {
            String op[] = scanner.next().split(",");
            int a = Integer.parseInt(op[0]);
            int b = Integer.parseInt(op[1]);
            int temp = numbers[a-1];
            numbers[a-1] = numbers[b-1];
            numbers[b-1] = temp;
        }
        for (int i = 0; i < w; i++) {
            System.out.println(numbers[i]);
        }
    }
}