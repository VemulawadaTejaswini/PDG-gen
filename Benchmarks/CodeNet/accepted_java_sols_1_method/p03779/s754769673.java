/**
 * 2019/02/21
 * 056C
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (true) {
            i++;
            sum += i;
            if (sum >= x) {
                break;
            }
        }
        System.out.println(i);
    }
}