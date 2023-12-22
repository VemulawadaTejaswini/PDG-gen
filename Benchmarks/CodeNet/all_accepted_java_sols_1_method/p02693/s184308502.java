import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a - 1) / k == b / k) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }
    }
}