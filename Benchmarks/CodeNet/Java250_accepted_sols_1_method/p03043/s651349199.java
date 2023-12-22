import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Double sco = 0.0;
        for (int i = 1; i <= a; i++) {
            int co = 0;
            for (int j = i; j < b;j *= 2 ) {
                co += 1;

            }

            sco += (1.0 / a) * Math.pow(0.5, co);
        }
        System.out.println(sco);
    }
}
