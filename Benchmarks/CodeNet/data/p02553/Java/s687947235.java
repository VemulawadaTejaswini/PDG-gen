import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int currentMax = 0;
        if (a*c > currentMax) {
            currentMax = a*b;
        }
        else if (a*d > currentMax) {
            currentMax = a*d;
        }
        else if (b*c > currentMax) {
            currentMax = b*c;
        }
        else if (b*d > currentMax) {
            currentMax = b*d;
        }
        System.out.println(currentMax);
    }
}
