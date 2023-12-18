import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int x[] = new int[3];
            int i = 0;
            int k;
            for (k = 0; k < 3; k++) {
                int y = scan.nextInt();
                if (0 < y && y < 10001) {
                    x[i] = y;
                    i++;
                } else {
                    System.out.println("1??????10000?????§???????????§???");
                    break;
                }
            }
            int j;
            for (i = x.length - 1; 0 <= i; i--) {
                for (j = i; j < x.length - 1; j++) {
                    if (x[j] > x[j + 1]) {
                        int y = x[j];
                        x[j] = x[j + 1];
                        x[j + 1] = y;
                    }
                }
            }
                for (int z : x) {
                    System.out.print(z + " ");
                }
        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}