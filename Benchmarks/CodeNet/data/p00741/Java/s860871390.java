
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int w = scan.nextInt();
            int h = scan.nextInt();
            if(w == 0 && h == 0)break;
            int map[][] = new int[w][h];
            for(int i = 0;i < h;i++){
                for(int j = 0;j < w;j++){
                    map[j][i] = scan.nextInt();
                }
            }
            int count = 0;
            for(int i = 0;i < h;i++){
                for(int j = 0;j < w;j++){
                    if(findIsland(map, j, i))count++;
                }
            }

            System.out.println(count);

        }

        scan.close();
    }

    static boolean findIsland(int map[][], int w, int h){
        if(map[w][h] == 0)return false;
         map[w][h] = 0;
        boolean up = false, down = false, right = false, left = false;
        int H = map[0].length;
        int W = map.length;
        if(h-1 >= 0)up = true;
        if(h+1 < H)down = true;
        if(w+1 < W)right = true;
        if(w-1 >= 0)left = true;
        if(up){
            if(map[w][h-1] == 1)
            findIsland(map, w, h-1);
        }
        if(down){
            if(map[w][h+1] == 1)
            findIsland(map, w, h+1);
        }
        if(right){
            if(map[w+1][h] == 1)
            findIsland(map, w+1, h);
        }
        if(left){
            if(map[w-1][h] == 1)
            findIsland(map, w-1, h);
        }
        if(up && right){
            if(map[w+1][h-1] == 1)
            findIsland(map, w+1, h-1);
        }
        if(up && left){
            if(map[w-1][h-1] == 1)
            findIsland(map, w-1, h-1);
        }
        if(down && right){
            if(map[w+1][h+1] == 1)
            findIsland(map, w+1, h+1);
        }
        if(down && left){
            if(map[w-1][h+1] == 1)
            findIsland(map, w-1, h+1);
        }
        return true;

    }

}
