import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, n = scanner.nextInt();
        int min = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for(i = 1; i < n; ++i){
            int input = scanner.nextInt();
            max = Math.max(max, input - min);
            min = Math.min(min, input);
        }
        System.out.println(max);
        scanner.close();
    }
}
