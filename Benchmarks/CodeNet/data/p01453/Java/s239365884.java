/* package whatever; // don't place package name! */
   
import java.util.*;
import java.lang.*;
import java.io.*;
   
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
       
    public static final int[] vs = {1, 0, -1, 0};
   
    public static final double EPS = 1e-10;
       
    public static void bfs(final int H, final int W, final int sx, final int sy, boolean[][] is_wall, boolean[][] is_floor, double[][] expected, boolean is_spring){           
        LinkedList<Double> expected_queue = new LinkedList<Double>();
        LinkedList<Integer> x_queue = new LinkedList<Integer>();
        LinkedList<Integer> y_queue = new LinkedList<Integer>();
           
        expected_queue.add(expected[sy][sx]);
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
                }
                
                ///System.out.println(nx + " " + ny + " " + expected[y][x] + " " + expected[ny][nx]);
             
                if(is_floor[ny][nx] && expected[ny][nx] > expected[y][x] + 1){
                	expected[ny][nx] = expected[y][x] + 1;
                    y_queue.add(ny);
                    x_queue.add(nx);
                }
            }
        }
    }
       
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        {
            final int W = sc.nextInt();
            final int H = sc.nextInt();
               
            int sx = -1, sy = -1, gx = -1, gy = -1;
            boolean[][] is_floor = new boolean[H][W];
            boolean[][] is_wall = new boolean[H][W];
               
            LinkedList<Integer> spring_xs = new LinkedList<Integer>();
            LinkedList<Integer> spring_ys = new LinkedList<Integer>();
               
            for(int i = 0; i < H; i++){
                final char[] line = sc.next().toCharArray();
                for(int j = 0; j < W; j++){
                    if(line[j] != '#' && line[j] != '*'){
                        is_floor[i][j] = true;
                    }else if(line[j] == '*'){
                        spring_ys.add(i);
                        spring_xs.add(j);
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
            
            final double INF = Long.MAX_VALUE;
            
            double upper = INF;
            double lower = 0;
            
            double[][] expected = new double[H][W];
            
            int counter = 0;
            while(upper - lower > EPS){\
            	final double middle = (upper + lower) / 2;
            	counter++;
            
            	for(int i = 0; i < H; i++){
            		for(int j = 0; j < W; j++){
            			expected[i][j] = INF;
            		}
            	}
            	expected[gy][gx] = 0;
            	
            	for(Iterator<Integer> x_itr = spring_xs.iterator(), y_itr = spring_ys.iterator(); x_itr.hasNext() && y_itr.hasNext(); ){
            		final int x = x_itr.next();
            		final int y = y_itr.next();
            		
            		expected[y][x] = middle;
            	}
            	
            	bfs(H, W, gx, gy, is_wall, is_floor, expected, false);
            	/*for(int i = 0; i < H; i++){
            		for(int j = 0; j < W; j++){
            			System.out.printf("%3.0f ", expected[i][j] >= INF ? Double.NaN : expected[i][j]);
            		}
            		System.out.println();
            	}*/
            	
            	for(Iterator<Integer> x_itr = spring_xs.iterator(), y_itr = spring_ys.iterator(); x_itr.hasNext() && y_itr.hasNext(); ){
            		final int x = x_itr.next();
            		final int y = y_itr.next();
            		
            		bfs(H, W, x, y, is_wall, is_floor, expected, true);
            	}
            	/*
            	for(int i = 0; i < H; i++){
            		for(int j = 0; j < W; j++){
            			System.out.printf("%3.0f ", expected[i][j] >= INF ? Double.NaN : expected[i][j]);
            		}
            		System.out.println();
            	}*/
            	
            	double expected_sum = 0;
            	int count = 0;
            	for(int i = 0; i < H; i++){
            		for(int j = 0; j < W; j++){
            			if(!is_floor[i][j]){
            				continue;
            			}else if(i == gy && j == gx){
            				continue;
            			}
            			
            			count++;
            			expected_sum += expected[i][j];
            		}
            	}
            	
            	final double expected_value = expected_sum / count;
            	
            	if(expected_value < middle){
            		upper = middle;
            	}else if(expected_value > middle){
            		lower = middle;
            	}else{
            		upper = middle;
            		lower = middle;
            	}
            	
            	//System.out.println(upper + " " + middle + " " + lower + " " + expected_value + " "  + count);
            	
            	if(counter % 10 == 0){
            		System.gc();
            	}
            }
            
            System.out.printf("%.10f\n", expected[sy][sx]);
        }
    }
}