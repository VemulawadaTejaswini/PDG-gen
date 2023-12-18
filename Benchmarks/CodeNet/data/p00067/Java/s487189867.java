import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean[][] island = new boolean[12][12];
            int[][] map = new int[12][12];
            for (int i = 0; i < 12; i++) {
                Arrays.fill(map[i], 999);
                String str = sc.next();
                for (int j = 0; j < 12; j++) {
                    island[i][j] = str.toCharArray()[j] == '1';
                }
            }
            int count = 0;
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (island[i][j]) {
                        if (i - 1 >= 0 && island[i - 1][j]) {
                            map[i][j] = Math.min(map[i][j], map[i - 1][j]);
                        } else if (j - 1 >= 0 && island[i][j - 1]) {
                            map[i][j] = Math.min(map[i][j], map[i][j - 1]);
                        } else if (j + 1 < 12 && island[i][j + 1]) {
                            for (int k = j; k < 11; k++) {
                                if (i - 1 >= 0 && island[i][k] && island[i][k + 1] && island[i - 1][k + 1]) {
                                    map[i][j] = map[i - 1][k + 1];
                                    count--;
                                    break;
                                }
                            }
                            map[i][j] = count++;
                        } else {
                            map[i][j] = count++;
                        }
                    }
                }
            }
            System.out.println(count);
//                        for(int i=0;i<12;i++) {
//                            for(int j=0;j<12;j++) {
//                                System.out.print(map[i][j]!=999?map[i][j]:" ");
//                            }
//                            System.out.println();
//                        }
        }
    }
}

