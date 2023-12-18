import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count1 = x / 500;
        int count2 = x % 500;
        int count3 = count2 / 5;
        System.out.println(count1 * 1000 + count3 * 5);
    }
}
