import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("0 0")) {
                break;
            }
            
            String[] numbers = input.split(" ");
            List<String> list = Arrays.asList(numbers);
            Collections.sort(list, (c1, c2) -> Integer.parseInt(c1) - Integer.parseInt(c2));
            
            System.out.println(list.get(0) + " " + list.get(1)); 
        }
    }
}
