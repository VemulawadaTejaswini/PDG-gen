import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int happy500 = 0;
        int happy5 = 0;
        happy500 = total / 500 * 1000;
        happy5 = (total % 500) / 5 * 5;
        System.out.println(happy500 + happy5);
    }
}
