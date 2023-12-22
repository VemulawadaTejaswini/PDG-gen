import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int v = sc.nextInt();
            if (v == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}