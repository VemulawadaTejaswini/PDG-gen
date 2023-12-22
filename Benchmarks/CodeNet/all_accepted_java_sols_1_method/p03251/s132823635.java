import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int x;
        int max_x = scan.nextInt();
        for (int i = 1; i < N; i++) {
            x = scan.nextInt();
            if (max_x < x) {
                max_x = x;
            }
        }
        int y;
        int min_y = scan.nextInt();
        for (int i = 1; i < M; i++) {
            y = scan.nextInt();
            if (min_y > y) {
                min_y = y;
            }
        }

        Boolean war = true;
        for (int Z = X + 1; Z <= Y; Z++) {
            if (max_x < Z && min_y >= Z) {
                war = false;
                break;
            }
        }

        if (war) {
            System.out.println("War");
        }
        else {
            System.out.println("No War");
        }

        scan.close();
    }
}