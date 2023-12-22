import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 500;
        int tmp = n - a * 500;
        int b = tmp / 5;
        System.out.println(a * 1000 + b * 5);
    }
}
