import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        int s = 0;

        if (Math.pow(l1, 2) == Math.pow(l2, 2) + Math.pow(l3, 2))
            s = (l2 * l3) / 2;
        else if (Math.pow(l2, 2) == Math.pow(l1, 2) + Math.pow(l3, 2))
            s = (l1 * l3) / 2;
        else
            s = (l2 * l1) / 2;

        System.out.println(s);
    }
}










