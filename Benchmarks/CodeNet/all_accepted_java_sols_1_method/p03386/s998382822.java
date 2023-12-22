import java.util.*;
public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 4
        int b = sc.nextInt(); // 12
        int k = sc.nextInt(); // 3
        
        if (b - a + 1 >= k * 2) {
            for (int index = a ; index < a + k ; index++) {
                System.out.println(index);
            }
            for (int index = k ; index > 0 ; index--) {
                System.out.println(b - index + 1);
            }
        } else {
            for (int index = a ; index < b + 1; index++) {
                System.out.println(index);
            }
        }
    }
}