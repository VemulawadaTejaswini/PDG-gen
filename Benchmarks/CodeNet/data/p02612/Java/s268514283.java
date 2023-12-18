import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 1000 == 0) {
            System.out.println(0);
            return;
        }
        int show = n / 1000;
        show ++;
        System.out.println(show * 1000 - n);
    }
}