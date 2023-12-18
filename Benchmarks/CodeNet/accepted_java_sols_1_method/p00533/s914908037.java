import java.util.*;

public class Main {
    private static final char CLOWD = 'c';

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int h = scn.nextInt(), w = scn.nextInt();
            int[][] area = new int[h][w];
            for(int i = 0; i < h; i++) {
                char[] line = scn.next().toCharArray();
                for(int j = 0; j < w; j++) {
                    area[i][j] = line[j] == CLOWD ? 0 : -1;
                }
            }

            for(int t = 0; t < w; t++) {
                for(int i = 0; i < h; i++) {
                    for(int j = t + 1; j < w; j++) {
                        if(area[i][j] < 0 && area[i][~-j] >= 0) {
                            area[i][j] = -~area[i][~-j];
                        }
                    }
                }
            }

            for(int[] ary : area) {
                StringBuilder sb = new StringBuilder();
                for(int elm : ary) {
                    sb.append(elm + " ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}