
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] input = reader.readLine().split(" ");
            int w = Integer.parseInt(input[0]), h = Integer.parseInt(input[1]);
            if(w==0 || h==0){
                return;
            }
            int[][] verticalWalls = new int[w-1][h], horizontalWalls = new int[w][h-1], cells = new int[w][h];

            input = reader.readLine().trim().split(" ");

            for(int j=0; j<w-1; j++){
                verticalWalls[j][0] = Integer.parseInt(input[j]);
            }

            for(int i=0; i < h-1; i++){
                input = reader.readLine().trim().split(" ");
                for(int j=0; j<w; j++){
                    horizontalWalls[j][i] = Integer.parseInt(input[j]);
                }

                input = reader.readLine().trim().split(" ");

                for(int j=0; j<w-1; j++){
                    verticalWalls[j][i+1] = Integer.parseInt(input[j]);
                }
            }
            for(int i=0; i<w; i++){
                for(int j=0; j<h; j++){
                    cells[i][j] = w * h + 1;
                }
            }
            search(verticalWalls, horizontalWalls, cells, 0, 0, 1);
            System.out.println((cells[w-1][h-1]==w*h+1)?0:cells[w-1][h-1]);
        }
    }

    public static void search(int[][] verticalWalls, int[][] horizontalWalls, int[][] cells, int x, int y, int value){
        if(x>verticalWalls.length || y>horizontalWalls[0].length){
            return;
        }
        if(cells[x][y] > value){
            cells[x][y] = value;
            if(x<verticalWalls.length && verticalWalls[x][y]==0){
                search(verticalWalls, horizontalWalls, cells, x + 1, y, value + 1);
            }

            if(x>0 && verticalWalls[x-1][y]==0){
                search(verticalWalls, horizontalWalls, cells, x - 1, y, value + 1);
            }

            if(y<horizontalWalls[0].length && horizontalWalls[x][y]==0){
                search(verticalWalls, horizontalWalls, cells, x, y + 1, value + 1);
            }

            if(y>0 && horizontalWalls[x][y-1]==0){
                search(verticalWalls, horizontalWalls, cells, x, y - 1, value + 1);
            }
        }
    }
}