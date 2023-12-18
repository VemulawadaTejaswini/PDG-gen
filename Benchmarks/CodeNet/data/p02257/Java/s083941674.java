import java.util.Scanner;

public class Main {
    
    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        int count = 0;
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            
            if (isPrime(a)) {
                count++;
            }
        }
        System.out.println(count + "");
    }
    
    private static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        } else if (a < 2 || a%2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(a); i = i + 2) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

