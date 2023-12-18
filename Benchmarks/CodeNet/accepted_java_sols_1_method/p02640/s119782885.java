import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();
 
        for (int i = 0; i <= x; ++i) {
            if (2*i + 4*(x - i) == y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}