import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0&&h == 0) break;
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            int[][] field = new int[2*h - 1][2*w - 1];

            for(int i = 0; i < 2*h-1; i++){
                if(i%2 == 0){
                    for(int j = 0; j < w-1; j++){
                        field[i][2*j + 1] = sc.nextInt();
                    }
                } 
                if(i%2 == 1){
                    for(int j = 0; j < w; j++){
                        field[i][2*j] = sc.nextInt();
                    }
                }
            }
            

            Queue<Integer> quex = new ArrayDeque<>();
            Queue<Integer> quey = new ArrayDeque<>();

            int[][] distance = new int[h][w];
            distance[0][0] = 1;

            quey.add(0);
            quex.add(0);
            while(!quey.isEmpty()){
                int y = quey.poll();
                int x = quex.poll();
                
                for(int dir = 0; dir < 4; dir++) {
                    int nh = y + dy[dir];
                    int nw = x + dx[dir];
                    if (nh < 0 || nh >= h || nw < 0 || nw >= w) continue;
                    if (field[nh+y][nw+x] == 1) continue; 
                    if (distance[nh][nw] != 0) continue;
                    distance[nh][nw] =distance[y][x] + 1;
                    if(nh==h-1 && nw==w-1) System.out.println(distance[h - 1][w - 1]);
                    quey.add(nh);
                    quex.add(nw);
                }
            }
            if(distance[h - 1][w - 1] == 0) System.out.println(0);
        }
        sc.close();
    }
}

