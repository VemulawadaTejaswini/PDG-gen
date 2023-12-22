import java.util.*;
public class Main {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int third = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int h = in.nextInt();
            if (h > first) {
                third = second;
                second = first;
                first = h;
            } else if (h > second) {
                third = second;
                second = h;
            } else if (h > third) {
                third = h;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}