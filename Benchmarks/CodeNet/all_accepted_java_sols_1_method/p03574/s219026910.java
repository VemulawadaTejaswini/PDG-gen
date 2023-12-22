import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        
        String[][] map = new String[H][W];        
        for(int y=0; y<H; y++){
            String[] s = sc.next().split(""); 
            for(int x=0; x<W; x++){
                map[y][x] = s[x];
            }
        }
        
        int[] direction_x = {-1, 0, 1,-1, 1,-1, 0, 1};
        int[] direction_y = {-1,-1,-1, 0, 0, 1, 1, 1};
        
        for(int y=0; y<H; y++){
            for(int x=0; x<W; x++){
                if(map[y][x].equals("#")){
                    System.out.print("#");
                    continue;
                }
                int ans = 0;
                for(int z=0; z<8; z++){
                    if(0 <= y+direction_y[z] && y+direction_y[z] < H && 0 <= x+direction_x[z] && x+direction_x[z] < W){
                        if(map[y+direction_y[z]][x+direction_x[z]].equals("#")){
                            ans++;
                        }
                    }
                }
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}