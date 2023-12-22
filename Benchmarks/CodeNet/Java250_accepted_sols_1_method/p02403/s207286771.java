import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            if (H == 0 && W == 0) {
                break;
            }

            for (int i = 0; i < H; i += 1) {
                for (int j = 0; j < W; j += 1) {
                    out.print("#");
                }
                out.println();
            }
            out.println();                                             
        }
    }   
}