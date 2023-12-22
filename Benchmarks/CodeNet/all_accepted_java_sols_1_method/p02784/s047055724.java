
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int helth = scan.nextInt();
        int power = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < power; i++) {
            sum = sum + scan.nextInt();
        }
        if(sum>=helth)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
