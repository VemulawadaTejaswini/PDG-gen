import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int VISITED = -1;
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if((w|h)==0)break;
            map = new int[h][w];
            int xs = sc.nextInt()-1;
            int ys = sc.nextInt()-1;
            int xg = sc.nextInt()-1;
            int yg = sc.nextInt()-1;
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int c = sc.nextInt();
                int d = sc.nextInt();
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                setBlock(c,d,x,y);
            }
            boolean flag = false;
            Point sp = new Point(xs,ys);
            Queue<Point> fifo = new LinkedList<Point>();
            fifo.add(sp);
            int color = map[ys][xs];
            if(color==VISITED||color!=map[yg][xg]){
            	System.out.println("NG");
            	continue;
            }
            while(fifo.peek()!=null){
                Point p = fifo.poll();

                if(p.x==xg&&p.y==yg){
                    flag=true;
                    break;
                }
                int x = p.x;
                int y = p.y;

                int[] dx={1,0,-1,0};
                int[] dy={0,1,0,-1};
                for(int i=0;i<4;i++){
                    int nx = x+dx[i];
                    int ny = y+dy[i];
                    if(nx>=0&&nx<w&&ny>=0&&ny<h&&map[ny][nx]==color){
                        fifo.add(new Point(nx,ny));
                        map[ny][nx]=VISITED;
                    }
                }
            }
            System.out.println(""+(flag? "OK" : "NG"));
        }

    }
    public static void setBlock(int c,int d, int x, int y){
        if(d==0){
            for(int i=0;i<2;i++){
                for(int j=0;j<4;j++){
                    map[y+i][x+j] = c;
                }
            }
        }
        else if(d==1){
            for(int i=0;i<4;i++){
                for(int j=0;j<2;j++){
                    map[y+i][x+j] = c;
                }
            }
        }
    }
}