import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdId = new Scanner(System.in);
        int W = stdId.nextInt();
        int H = stdId.nextInt();
        int x = stdId.nextInt();
        int y = stdId.nextInt();
        int r = stdId.nextInt();

        String j = "No";

        if (x >= r && y >= r) {
            if (x <= (W - r) && y <= (H - r)) {
                j = "Yes";
            }
        }

        System.out.println(j);

    }
}