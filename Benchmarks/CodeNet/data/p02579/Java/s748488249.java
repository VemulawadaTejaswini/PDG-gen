import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    List<List<Pair>> lists = new ArrayList<>();
    int c1 = sc.nextInt() - 1;
    int c2 = sc.nextInt() - 1;
    int d1 = sc.nextInt() - 1;
    int d2 = sc.nextInt() - 1;
    char[][] arr = new char[h][w];
    int[] dy = {1, 0, -1, 0};
    int[] dx = {0, 1, 0, -1};
    int[][] warpCnt = new int[h][w];
    boolean[][] flag = new boolean[h][w];


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

//        List<Pair> list = new ArrayList<>();
//        list.add(new Pair(c1, c2));
        bfs(new Pair(c1, c2));

//        for (int i=0; i<h; i++) {
//            for (int j=0; j<w-1; j++) {
//                System.out.print(warpCnt[i][j] + " ");
//            }
//            System.out.println(warpCnt[i][w-1]);
//        }

        if (!flag[d1][d2]) System.out.println(-1);
        else System.out.println(warpCnt[d1][d2]);

    }

    void bfs(Pair pair){
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(pair);
        List<Pair> list = new ArrayList<>();
        list.add(pair);
        while (!queue.isEmpty()){
            Pair p = queue.peek();
            int y = p.y;
            int x = p.x;
            flag[y][x] = true;
            for (int i=0; i<4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
                if (flag[ny][nx]) continue;
                if (arr[ny][nx] == '#') continue;
                flag[ny][nx] = true;
                list.add(new Pair(ny, nx));
                queue.add(new Pair(ny, nx));
                warpCnt[ny][nx] = warpCnt[y][x];
            }
            queue.poll();
            if (queue.isEmpty()) {
                if (list.size()==0) break;
                for (Pair pair1: list) {
                    int y1 = pair1.y;
                    int x1 = pair1.x;
                    for (int yy=-2; yy<=2; yy++) {
                        for (int xx=-2; xx<=2; xx++) {
                            int nyy = y1 + yy;
                            int nxx = x1 + xx;
                            if (yy==0 && xx==0) continue;
                            if (nyy<0 || h<=nyy || nxx<0 || w<=nxx) continue;
                            if (arr[nyy][nxx] == '#') continue;
                            if (flag[nyy][nxx]) continue;
                            queue.add(new Pair(nyy, nxx));
                            warpCnt[nyy][nxx] = warpCnt[y1][x1] + 1;
                        }
                    }
                }
                list.clear();
            }
        }
    }



    class Pair {
        int y;
        int x;
        public Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }



}

