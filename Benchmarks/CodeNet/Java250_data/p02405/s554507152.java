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
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            out.print("#");
                        } else {
                            out.print(".");
                        }
                    } else {
                        if (j % 2 == 1) {
                            out.print("#");
                        } else {
                            out.print(".");                            
                        }
                    }
                }
                out.println();
            }
            out.println();
        }
    }   
}