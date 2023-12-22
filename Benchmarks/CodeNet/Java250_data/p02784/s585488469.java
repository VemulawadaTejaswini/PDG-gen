import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += sc.nextInt();
        }
        if(a <= total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
