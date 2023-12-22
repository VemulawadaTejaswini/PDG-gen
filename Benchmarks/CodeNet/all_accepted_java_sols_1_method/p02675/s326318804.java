import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n % 10;
        if (tmp == 2 || tmp == 4 || tmp == 5 || tmp == 7 || tmp == 9) {
            System.out.println("hon");
        } else if (tmp == 3) {
            System.out.println("bon");
        } else {
            System.out.println("pon");
        }
    }
}
