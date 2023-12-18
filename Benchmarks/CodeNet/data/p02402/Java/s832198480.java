import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int [] array ={n};      
        int min = 0;
        int sum = 0;
        int max = 0;
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt();
            sum = sum + a;
            if (a > max) {
                max = a;
            } else if (min > a) {
                min = a;
            }
        }
        System.out.println(min +" "+ max +" "+ sum);
    }
}