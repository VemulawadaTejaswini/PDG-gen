import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= val1; i++) {
            String temp = "" + i;
            if ((temp.length() % 2) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}