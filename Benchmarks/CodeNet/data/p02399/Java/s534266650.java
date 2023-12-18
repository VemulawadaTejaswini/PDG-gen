import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] numbers = scanner.nextLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        
        System.out.println(String.format("%d %d %.6f", a/b, a%b, (double)a/(double)b));
    }
}
