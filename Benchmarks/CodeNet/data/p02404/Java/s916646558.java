import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if ("0 0".equals(input)) {
                break;
            }
            String[] numbers = input.split(" ");
            
            int h = Integer.parseInt(numbers[0]);
            int w = Integer.parseInt(numbers[1]);
            
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if (j == 0 || j == w-1) {
                        System.out.print("#");
                    } else {
                        if (i == 0 || i == h-1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
