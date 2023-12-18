import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i < 10001) {
            if (x == 0) {
                break;
            } else {
                System.out.println("Case " + i + ": " + x);
                i++;
            }
        }
    }
 
}
