import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String[] list = sc.next().split("");

        int count = 0;

        for (int i = 0; i < list.length / 2; i++) {
            if (!list[i].equals(list[list.length - 1 - i])) {
                count++;
            }
        }

        System.out.println(count);
    }
}