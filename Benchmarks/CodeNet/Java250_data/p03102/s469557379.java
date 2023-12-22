import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[], bin[];
        int row, col, c, res, ret;
        in = scanner.nextLine().split(" ");
        row = Integer.parseInt(in[0]);
        col = Integer.parseInt(in[1]);
        c = Integer.parseInt(in[2]);

        bin = scanner.nextLine().split(" ");
        ret = 0;
        for (int i = 0; i < row; i++) {
            in = scanner.nextLine().split(" ");
            res = c;
            for (int j = 0; j < col; j++) {
                res += Integer.parseInt(in[j]) * Integer.parseInt(bin[j]);
            }
            if (res > 0) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}