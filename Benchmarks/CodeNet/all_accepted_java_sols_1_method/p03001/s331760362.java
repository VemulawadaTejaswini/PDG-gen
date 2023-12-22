import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();

        int judge = 0;
        double centerW = 0.000000;
        double centerH = 0.000000;
        if (W % 2 == 0) {
            centerW = W / 2;
        } else {
            centerW = W / 2 + 1;
        }

        if (H % 2 == 0) {
            centerH = H / 2;
        } else {
            centerH = H / 2 + 1;
        }

        if (centerH == y && centerW == x) {
            judge = 1;
        } else {
            judge = 0;
        }

        System.out.println(((double) W * (double) H) / 2 + " " + judge);
    }

}
