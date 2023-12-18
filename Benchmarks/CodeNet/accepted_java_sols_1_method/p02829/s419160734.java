import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        Scanner scanner = new Scanner(System.in);
        numbers.remove(scanner.nextInt());
        numbers.remove(scanner.nextInt());
        
        for(int i: numbers) {
            System.out.println(i);
        }
        
        //
        
        
        
    }
}
