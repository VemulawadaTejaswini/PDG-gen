import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int wa = a + b;
        int sa = a - b;
        int seki = a * b;
        
        int maxWaSa = Math.max(wa, sa);
        System.out.println(Math.max(seki, maxWaSa));
    }
}