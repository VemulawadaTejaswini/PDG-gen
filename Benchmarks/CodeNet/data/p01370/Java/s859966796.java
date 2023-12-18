import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {
    public static class Data{
        int x,y,tern;

        Data(int x,int y,int tern) {
            this.x=x;
            this.y=y;
            this.tern=tern;
            dataNum++;
        }
    }
    static Scanner s = new Scanner(System.in);
    static int num,dataNum=0;
    static int[][] map = new int[101][101];
    static Deque<Data> queue = new ArrayDeque<Data>();


    static void move(int x, int y, int turn) {
//        if (x < -30 || 30 < x || y < -30 || 30 < y) return;
        if (map[x + 50][y + 50] == -2) return;
        if (map[x + 50][y + 50] == -1) {
            num++;
            map[x + 50][y + 50] = -2;
        }
        if (turn == 0) return;
        Data t1 = new Data(x+1,y+1,turn-1);
        queue.offer(t1);
        Data t2 = new Data(x+1,y,turn-1);
        queue.offer(t2);
        Data t3 = new Data(x,y+1,turn-1);
        queue.offer(t3);
        Data t4 = new Data(x,y-1,turn-1);
        queue.offer(t4);
        Data t5 = new Data(x-1,y,turn-1);
        queue.offer(t5);
        Data t6 = new Data(x-1,y-1,turn-1);
        queue.offer(t6);
    }

    public static void main(String[] args) {
        int tern, object;
        int x, y;

        while (true) {
            tern = s.nextInt();
            object = s.nextInt();

            if (tern == 0 && object == 0) break;

            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++)
                    map[i][j] = -1;
            }
            num = 0;
            dataNum=0;

            for (int i = 0; i < object; i++) {
                x = s.nextInt();
                y = s.nextInt();

                map[x + 50][y + 50] = -2;
            }

            x = s.nextInt();
            y = s.nextInt();

            Data param = new Data(x,y,tern);
            queue.offer(param);
            Data p;
            while(!queue.isEmpty()) {
                p = queue.poll();
                move(p.x, p.y, p.tern);
            }
            System.out.println(num);
        }
    }
}