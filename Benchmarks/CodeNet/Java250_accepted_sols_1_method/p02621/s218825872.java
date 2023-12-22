import java.util.Scanner;
        
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = Integer.valueOf(scanner.nextLine());
        
        int value;
        
        value = a + (a*a) + (a*a*a);
        
        System.out.println(value);
    }
}