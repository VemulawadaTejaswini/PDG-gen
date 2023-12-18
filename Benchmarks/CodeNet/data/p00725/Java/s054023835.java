import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while(true){
            String[] line = reader.readLine().split(" ");
            int w = Integer.parseInt(line[0]), h = Integer.parseInt(line[1]);
            if(w==0 && h==0) break;

            int[][] map = new int[h][w];
            for(int i=0; i<h; i++){
                line = reader.readLine().split(" ");
                for(int j=0; j<w; j++){
                    map[i][j] = Integer.parseInt(line[j]);
                }
            }
            boolean fin = false;
            for(int i=0; i<h && !fin; i++){
                for(int j=0; j<w && !fin; j++){
                    if(map[i][j] == 2){

                        int tmp_r = move(map, j+1, i, RIGHT, 1, true);
                        int tmp_l = move(map, j-1, i, LEFT, 1, true);
                        int tmp_u = move(map, j, i-1, UP, 1, true);
                        int tmp_d = move(map, j, i+1, DOWN, 1, true);
                        if(tmp_r==-1){
                            tmp_r = 11;
                        }
                        if(tmp_l==-1){
                            tmp_l = 11;
                        }
                        if(tmp_u==-1){
                            tmp_u = 11;
                        }
                        if(tmp_d==-1){
                            tmp_d = 11;
                        }
                        int min = Math.min(Math.min(tmp_d, tmp_u), Math.min(tmp_l, tmp_r));
                        if(min <= 10){
                            System.out.println(min);
                        } else {
                            System.out.println(-1);
                        }
                        fin = true;
                    }
                }
            }

        }
    }

    public static int move(int[][] map, int x, int y, int destination, int count, boolean ischanged){
        if(x<0 || y<0 || y>=map.length || x>=map[y].length) return 11;
        if(map[y][x] == 3) return count;
        if(map[y][x] == 1) {
            return ischanged?11:-1;
        }
        if(count > 10) return 11;
        switch (destination){
            case RIGHT:
                int tmp = move(map, x+1, y, destination, count, false);
                if(tmp > 10) {
                    return tmp;
                }
                if(tmp==-1){
                    int[][] newMap = new int[map.length][map[0].length];
                    for(int my=0; my<newMap.length; my++) {
                        for (int mx = 0; mx < newMap[0].length; mx++) {
                            newMap[my][mx] = map[my][mx];
                        }
                    }
                    newMap[y][x+1] = 0;
                    int tmp_u = move(newMap, x, y-1, UP, count + 1, true);
                    int tmp_d = move(newMap, x, y+1, DOWN, count + 1, true);
                    int tmp_r = move(newMap, x+1, y, RIGHT, count + 1, true);
                    int tmp_l = move(newMap, x-1, y, LEFT, count + 1, true);

                    return Math.min(Math.min(tmp_d, tmp_u), Math.min(tmp_l, tmp_r));
                } else {
                    return tmp;
                }

            case LEFT:
                tmp = move(map, x-1, y, destination, count, false);
                if(tmp > 10) {
                    return tmp;
                }
                if(tmp==-1){
                    int[][] newMap = new int[map.length][map[0].length];
                    for(int my=0; my<newMap.length; my++) {
                        for (int mx = 0; mx < newMap[0].length; mx++) {
                            newMap[my][mx] = map[my][mx];
                        }
                    }
                    newMap[y][x-1] = 0;
                    int tmp_u = move(newMap, x, y-1, UP, count + 1, true);
                    int tmp_d = move(newMap, x, y+1, DOWN, count + 1, true);
                    int tmp_r = move(newMap, x+1, y, RIGHT, count + 1, true);
                    int tmp_l = move(newMap, x-1, y, LEFT, count + 1, true);

                    return Math.min(Math.min(tmp_d, tmp_u), Math.min(tmp_l, tmp_r));
                } else {
                    return tmp;
                }

            case UP:
                tmp = move(map, x, y-1, destination, count, false);
                if(tmp > 10) {
                    return tmp;
                }
                if(tmp==-1){
                    int[][] newMap = new int[map.length][map[0].length];
                    for(int my=0; my<newMap.length; my++) {
                        for (int mx = 0; mx < newMap[0].length; mx++) {
                            newMap[my][mx] = map[my][mx];
                        }
                    }
                    newMap[y-1][x] = 0;
                    int tmp_u = move(newMap, x, y-1, UP, count + 1, true);
                    int tmp_d = move(newMap, x, y+1, DOWN, count + 1, true);
                    int tmp_r = move(newMap, x+1, y, RIGHT, count + 1, true);
                    int tmp_l = move(newMap, x-1, y, LEFT, count + 1, true);

                    return Math.min(Math.min(tmp_d, tmp_u), Math.min(tmp_l, tmp_r));
                } else {
                    return tmp;
                }

            case DOWN:
                tmp = move(map, x, y+1, destination, count, false);
                if(tmp > 10) {
                    return tmp;
                }
                if(tmp==-1){
                    int[][] newMap = new int[map.length][map[0].length];
                    for(int my=0; my<newMap.length; my++) {
                        for (int mx = 0; mx < newMap[0].length; mx++) {
                            newMap[my][mx] = map[my][mx];
                        }
                    }
                    newMap[y+1][x] = 0;
                    int tmp_u = move(newMap, x, y-1, UP, count + 1, true);
                    int tmp_d = move(newMap, x, y+1, DOWN, count + 1, true);
                    int tmp_r = move(newMap, x+1, y, RIGHT, count + 1, true);
                    int tmp_l = move(newMap, x-1, y, LEFT, count + 1, true);

                    return Math.min(Math.min(tmp_d, tmp_u), Math.min(tmp_l, tmp_r));
                } else {
                    return tmp;
                }
            default:
                return 11;
        }
    }
}