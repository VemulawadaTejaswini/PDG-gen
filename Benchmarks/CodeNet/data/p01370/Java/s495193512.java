import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int t = scanner.nextInt();
            int n = scanner.nextInt();
            if(t==0 && n==0){
                break;
            }
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int count = t * (t + 1) * 3 + 1;
            boolean[][] wall = new boolean[2*t+1][2*t+1];
            for (int i = 0; i < n; i++) {
                x[i] -= startX;
                y[i] -= startY;
                if (x[i] < -t || y[i] < -t || x[i] > t || y[i] > t) {
                    continue;
                }
                if (x[i] < 0 && y[i] > 0 || x[i] > 0 && y[i] < 0) {
                    if (Math.abs(x[i]) + Math.abs(y[i]) > t) {
                        continue;
                    }
                }
                wall[x[i] + t][y[i] + t] = true;
            }
            for(int i=0; i<2*t+1; i++){
                for(int j=0; j<2*t+1; j++){
                    if (i < t && j > t || i > t && j < t) {
                        if (Math.abs(i-t) + Math.abs(j-t) > t) {
                            continue;
                        }
                    }
                    int [][] tmp = new int[2*t+1][2*t+1];
                    if(!hasRoot(i - t, j - t, wall, t, t, tmp)){
                        //System.out.println(i+"," + j);
                        count--;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static boolean hasRoot(int x, int y, boolean[][] wall, int t, int origT, int[][] tmp){
        if(x == 0 && y == 0) return true;
        if(Math.abs(x) > origT || Math.abs(y) > origT || wall[x + origT][y + origT]){
            return false;
        }

        if(t == 0){
            return false;
        }
        if(tmp[x + origT][y + origT] >= t) return false;
        tmp[x+origT][y+origT] = t;
        return hasRoot(x + 1, y    , wall, t-1, origT, tmp) ||
                hasRoot(x    , y + 1, wall, t-1, origT, tmp) ||
                hasRoot(x + 1, y + 1, wall, t-1, origT, tmp) ||
                hasRoot(x - 1, y    , wall, t-1, origT, tmp) ||
                hasRoot(x    , y - 1, wall, t-1, origT, tmp) ||
                hasRoot(x - 1, y - 1, wall, t-1, origT, tmp);
    }

}