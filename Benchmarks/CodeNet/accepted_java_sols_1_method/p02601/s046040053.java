import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int cnt = 0;
        while (b <= a) { b *= 2; cnt++; }
        while (c <= b) { c *= 2; cnt++; }
        if (cnt <= k) System.out.println("Yes");
        else System.out.println("No");
    }
}
