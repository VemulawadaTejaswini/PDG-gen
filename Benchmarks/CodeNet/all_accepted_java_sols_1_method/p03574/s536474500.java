import java.util.Scanner;

public class Main {

    static final char ENPTY = '.';
    static final char BOMB = '#';
    static final int[][] SEARCH_AREA = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] grid = new char[h][w];

        for(int i = 0; i < h; i++){
            grid[i] =  sc.next().toCharArray();
        }

        for (int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                char tgt = grid[i][j];
                if(tgt == ENPTY){
                    int count = 0;
                    for(int k = 0; k < 8; k++){
                        int searchPosX = j + SEARCH_AREA[k][0];
                        int searchPosY = i + SEARCH_AREA[k][1];
                        if( searchPosX >= 0 &&
                                searchPosX < w &&
                                searchPosY >= 0 &&
                                searchPosY < h){
                            if(grid[searchPosY][searchPosX] == BOMB){
                                count++;
                            }
                        }
                    }
                    System.out.print(count);
                }else{
                    System.out.print(BOMB);
                }
            }
            System.out.println("");
        }
        sc.close();
    }

}