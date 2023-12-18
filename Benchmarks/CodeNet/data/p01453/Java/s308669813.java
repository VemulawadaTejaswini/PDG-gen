/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
     
    public static final int[] vs = {1, 0, -1, 0};
 
    public static final double EPS = 1e-10;
     
    public static boolean bfs(final int H, final int W, final int sx, final int sy, boolean[][] is_wall, boolean[][] is_floor, double[][] expected){
        boolean updated = false;
         
        LinkedList<Double> expected_queue = new LinkedList<Double>();
        LinkedList<Integer> x_queue = new LinkedList<Integer>();
        LinkedList<Integer> y_queue = new LinkedList<Integer>();
        boolean[][] visited = new boolean[H][W];
         
        expected_queue.add(expected[sy][sx]);
        visited[sy][sx] = true;
        x_queue.add(sx);
        y_queue.add(sy);
         
        while(!x_queue.isEmpty()){
            final int x = x_queue.poll();
            final int y = y_queue.poll();
             
            for(int v = 0; v < vs.length; v++){
                final int nx = x + vs[v];
                final int ny = y + vs[(v + 1) % vs.length];
                 
                if(nx < 0 || nx >= W || ny < 0 || ny >= H){
                    continue;   
                }else if(is_wall[ny][nx]){
                    continue;
                }else if(visited[ny][nx]){
                    continue;
                }else if(is_floor[ny][nx] && expected[ny][nx] >= expected[y][x] + 1){
                    if(expected[ny][nx] - EPS >= expected[y][x] + 1){
                        updated = true;
                    }
                     
                    expected[ny][nx] = expected[y][x] + 1;
                    visited[ny][nx] = true;
                    y_queue.add(ny);
                    x_queue.add(nx);
                }else if(!is_floor[ny][nx]){
                    visited[ny][nx] = true;
                    y_queue.add(ny);
                    x_queue.add(nx);
                }
            }
        }
         
        return updated;
    }
     
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        {
            final int W = sc.nextInt();
            final int H = sc.nextInt();
             
            final double INF = H * W;
             
            int sx = -1, sy = -1, gx = -1, gy = -1;
            boolean[][] is_floor = new boolean[H][W];
            boolean[][] is_wall = new boolean[H][W];
             
            LinkedList<Integer> spling_xs = new LinkedList<Integer>();
            LinkedList<Integer> spling_ys = new LinkedList<Integer>();
             
            for(int i = 0; i < H; i++){
                final char[] line = sc.next().toCharArray();
                for(int j = 0; j < W; j++){
                    if(line[j] != '#' && line[j] != '*'){
                        is_floor[i][j] = true;
                    }else if(line[j] == '*'){
                        spling_ys.add(i);
                        spling_xs.add(j);
                    }else if(line[j] == '#'){
                        is_wall[i][j] = true;
                    }
                     
                    if(line[j] == 's'){
                        sy = i;
                        sx = j;
                    }else if(line[j] == 'g'){
                        gy = i;
                        gx = j;
                    }
                }
            }
             
            double[][] expected = new double[H][W];
            for(int i = 0; i < H; i++){
                for(int j = 0; j < W; j++){
                    expected[i][j] = INF;
                }
            }
            expected[gy][gx] = 0;
             
            double prev_expected = expected[sy][sx];
            //while(expected[sy][sx] >= (INF - 1e-9) || Math.abs(expected[sy][sx] - prev_expected) > 1e-9){
            while(true){
            //for(int t = 0; t < 20; t++){
                prev_expected = expected[sy][sx];
                 
                boolean updated = false;
                 
                updated |= bfs(H, W, gx, gy, is_wall, is_floor, expected);
                for(Iterator<Integer> x_itr = spling_xs.iterator(), y_itr = spling_ys.iterator(); x_itr.hasNext() && y_itr.hasNext(); ){
                    final int x = x_itr.next();
                    final int y = y_itr.next();
                     
                    updated |= bfs(H, W, x, y, is_wall, is_floor, expected);
                }
                 
                 
                if(!updated){
                    break;
                }
                 
                 
                double sum = 0;
                int count = 0;
                for(int i = 0; i < H; i++){
                    for(int j = 0; j < W; j++){
                        if(!is_floor[i][j]){
                            continue;
                        }else if(i == gy && j == gx){
                            continue;
                        }
                         
                        sum += expected[i][j];
                        count++;
                    }
                }
                 
                final double average = sum / count;
                 
                for(Iterator<Integer> x_itr = spling_xs.iterator(), y_itr = spling_ys.iterator(); x_itr.hasNext() && y_itr.hasNext(); ){
                    final int x = x_itr.next();
                    final int y = y_itr.next();
                     
                    expected[y][x] = average;
                }
                /*
                for(int i = 0; i < H; i++){
                    for(int j = 0; j < W; j++){
                        System.out.printf("%2.0f ", expected[i][j]);
                    }
                    System.out.println();
                }
                */
                //System.out.printf("%.10f <- %.10f\n", expected[sy][sx], prev_expected);
            }
            System.out.printf("%.10f\n", expected[sy][sx]);
        }
    }
}