import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int h = x / 3600;
        int m = (x - h * 3600) / 60;
        int s = x - h * 3600 - m * 60;
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}
