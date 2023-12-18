import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function3 func = new Function3();

        int inH, inW;

        while (true) {
            inH = Integer.parseInt(scan.next());
            inW = Integer.parseInt(scan.next());

            if (inH == 0 && inW == 0) {
                break;
            }
            func.printf(inH, inW);
        }
    }
}

class Function3 {
    public void printf(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
