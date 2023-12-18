import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] map = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = Character.digit(s.charAt(j),10);
            }
        }
        int[][] minMap = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) continue;
                int fromTop = i > 0 ? minMap[i-1][j] : 10000000;
                int fromLeft = j > 0 ? minMap[i][j-1] : 1000000;
                minMap[i][j] = Math.min(fromTop, fromLeft) + map[i][j];
            }
        }
        System.out.println(minMap[h-1][w-1]);
    }

}