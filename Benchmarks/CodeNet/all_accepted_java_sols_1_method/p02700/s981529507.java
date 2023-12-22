import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int x = (int)Math.ceil((double)c / b);
        System.out.println(d * (x - 1) < a ? "Yes" : "No");
    }
}
