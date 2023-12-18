import java.util.Scanner;

class Main {
    
    public static void main(String... args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        
        boolean result = true;
        for (int i=0; i < numbers.length - 1; i++) {
            int current = Integer.parseInt(numbers[i]);
            int next = Integer.parseInt(numbers[i + 1]);
            
            if (current >= next) {
                result = false;
                break;
            }
        }
        
        System.out.println(result ? "Yes" : "No");
    }
}
