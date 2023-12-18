import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        int b = n % 10;
        
        if (b == 2 || b == 4 || b == 5 || b == 7 || b == 9) {
            System.out.println("hon");
        } else if (b == 0 || b == 1 || b == 6 || b == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}