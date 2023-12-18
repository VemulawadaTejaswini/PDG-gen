import java.util.Scanner;
        
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int payment = Integer.valueOf(scanner.nextLine());
        
        int change = 0;
        
        while(payment > 0) {
            
            payment -= 1000;
            
        }
        
        change = payment * -1;
        System.out.println(change);
        
    }
}