import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        int count = 0;

        while (true) {
            if (a < b) {
                break;
            }
            b = b * 2;
            count++;
        }
        while (true) {
            if (b < c) {
                break;
            }
            c = c * 2;
            count++;
        }
        if (k < count) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}