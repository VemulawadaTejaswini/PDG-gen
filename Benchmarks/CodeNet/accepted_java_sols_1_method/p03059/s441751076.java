import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int t = kbd.nextInt();

        int n = t / a;
        System.out.println(n * b);
    }
}