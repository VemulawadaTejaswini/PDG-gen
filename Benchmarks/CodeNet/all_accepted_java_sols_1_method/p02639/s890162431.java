import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int num = scan.nextInt();
            if (num == 0) {
                System.out.println(i);
            }
        }
    }
}