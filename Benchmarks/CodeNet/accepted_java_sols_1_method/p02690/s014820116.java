import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for (int a = 1; a <= 1000; a++) {
            for (int b = -1000; b < a; b++) {
                if ((long)a*a*a*a*a - (long)b*b*b*b*b == X) {
                    System.out.println(a+" "+b);
                    return;
                }
            }
        }
    }
}

