import java.util.Scanner;

public class Main {
    private static int count;
    private static int dominant_type; // 1 if white, 2 if black, 3 if neither;
    private static int[][] Map;
    private static int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static void paint(int x, int y) {
        count++;
        Map[y][x] = -1;
        int t;
        int ny, nx;
        for (int[] direction: directions) {
            ny = y + direction[1];
            nx = x + direction[0];

            if (nx >= 0 && nx < Map[0].length && ny >= 0 && ny < Map.length) {
                t = Map[ny][nx];
                if (t == -1) continue;
                if (t == 0) {
                    paint(nx, ny);
                } else {
                    if (dominant_type == 0)
                        dominant_type = t;
                    else if (dominant_type != t)
                        dominant_type = 3;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h;
        int white, black;
        String[] input;

        while (true) {
            input = sc.nextLine().trim().split(" ");
            w = Integer.parseInt(input[0]);
            h = Integer.parseInt(input[1]);
            count = 0;
            dominant_type = 0;
            white = 0;
            black = 0;

            if (w == 0) break;

            // Initialize Map
            Map = new int[h][w];
            for (int y = 0; y < h; y++) {
                input = sc.nextLine().trim().split("");
//                System.out.println(Arrays.toString(input));
                for (int x = 0; x < w; x++) {
//                    System.out.println(input[x]);
                    if (input[x].equals("W"))
                        Map[y][x] = 1;
                    else if (input[x].equals("B"))
                        Map[y][x] = 2;
                }
            }

            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    if (Map[y][x] == 0) {
                        paint(x, y);
//                        System.out.println(dominant_type + " " + count);
                        if (dominant_type == 1)
                            white += count;
                        else if (dominant_type == 2)
                            black += count;
                    }
                    count = 0;
                    dominant_type = 0;

                }
            }

            System.out.println(black + " " + white);
        }
    }
}