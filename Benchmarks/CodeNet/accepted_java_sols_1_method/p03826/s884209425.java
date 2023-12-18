import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        int result_1 = a * b;
        int result_2 = c * d;
        
        if (result_1 > result_2) {
            System.out.println(result_1);
        } else {
            System.out.println(result_2);
        }
        scan.close();
    }
}