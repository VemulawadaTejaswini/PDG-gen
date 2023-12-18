import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = Integer.parseInt(scanner.nextLine());
        int primeCount = 0;
        for (int i = 0 ; i < lineCount ; i++) {
            if (isPrimeNumber(Integer.parseInt(scanner.nextLine()))) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
    }
    
    private static boolean isPrimeNumber(int n) {
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n) ; i += 2) {
           if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

