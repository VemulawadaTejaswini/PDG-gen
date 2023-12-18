
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = 10;
        int w = 10;

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}

