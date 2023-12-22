import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int x[] = new int[3];
            int i = 0;
            for (int k = 0; k < 3; k++) {
                int y = scan.nextInt();
                if (0 < y && y < 10001) {
                    x[i] = y;
                    i++;
                } else {
                    System.out.println("1??????10000?????§???????????§???");
                    break;
                }
            }
            if (x.length == 3) {
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
                for (i = 0; i < x.length - 1; i++) {
                    System.out.print(x[i]+ " ");
                }
                System.out.println(x[x.length - 1]);
            }
        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}