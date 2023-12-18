import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int w = Integer.parseInt(numbers[0]);
        int h = Integer.parseInt(numbers[1]);
        int x = Integer.parseInt(numbers[2]);
        int y = Integer.parseInt(numbers[3]);
        int r = Integer.parseInt(numbers[4]);
        
        int right = x - r;
        int top = y + r;
        int left = x + r;
        int bottom = y - r;
        
        if ((right >= 0 && right <= w - 2*r)
            && (bottom >= 0 && bottom <= h - 2*r)
            && (left <= w) && (top <= h)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
}
