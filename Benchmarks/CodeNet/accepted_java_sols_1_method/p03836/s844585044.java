import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        StringBuilder builder = new StringBuilder();

        // 最短経路
        int xd = Math.abs(sx - tx);
        int yd = Math.abs(sy - ty);
        // 1回目行き
        for (int i = 0; i < yd; i++) {
            builder.append(sy > ty ? "D" : "U");
        }
        for (int i = 0; i < xd; i++) {
            builder.append(sx > tx ? "L" : "R");
        }
        // 1回目帰り
        for (int i = 0; i < yd; i++) {
            builder.append(sy < ty ? "D" : "U");
        }
        ++xd;
        for (int i = 0; i < xd; i++) {
            builder.append(sx < tx ? "L" : "R");
        }
        // 2回目行き
        ++yd;
        for (int i = 0; i < yd; i++) {
            builder.append(sy > ty ? "D" : "U");
        }
        for (int i = 0; i < xd; i++) {
            builder.append(sx > tx ? "L" : "R");
        }
        builder.append(sy < ty ? "D" : "U");
        // 2回目帰り
        builder.append(sx > tx ? "L" : "R");
        for (int i = 0; i < yd; i++) {
            builder.append(sy < ty ? "D" : "U");
        }
        for (int i = 0; i < xd; i++) {
            builder.append(sx < tx ? "L" : "R");
        }
        builder.append(sy > ty ? "D" : "U");
        System.out.println(builder);
    }
}