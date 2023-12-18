import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = Integer.parseInt(sc.next()); 
            int w = Integer.parseInt(sc.next());
            if (h == 0 && w == 0) {
                break;
            } else {
                for (int j = 0; j < h; j++) {
                    for (int i = 0; i < w; i++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
