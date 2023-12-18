import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int k = input.nextInt();
        if (m1 == 0) {
            m1 = 60;
        }
        if (m2 == 0) {
            m2 = 60;
        }
        int minute = (h2-h1)*60 + (m2-m1);
        System.out.println(minute-k);
    }
}