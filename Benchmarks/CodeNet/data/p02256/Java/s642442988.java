import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(gcd(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
    }
    
    private static int gcd(int x, int y) {
        int l = Math.max(x, y);
        int s = Math.min(x, y);
        
        if (l % s == 0) {
            return s;
        }
        return gcd(l % s, s);
    }
}

