
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        IntStream.rangeClosed(1, n).forEach(i -> {
            if (i % 3 == 0) {
                System.out.print(" " + i);
                return;
            }
            if (i % 10 == 3) {
                System.out.print(" " + i);
                return;
            }
            int devided = i / 10;
            while (true) {
                if (devided <= 0) {
                    break;
                }
                if (devided % 10 == 3) {
                    System.out.print(" " + i);
                    return;
                }
                devided = devided / 10;
            }
        });
        System.out.println();
    }
}



