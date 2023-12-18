import java.util.*;

// {U,R,D,L}:{0,1,2,3}

public class Main {
    int[] dx = {0,1,0,-1};
    int[] dy = {-1,0,1,0};
    String[] direction = {"U","R","D","L"};

    void run(){
        Arc arc = new Arc(5);
 //       arc.printArc();
        int x = 0, y = 0, d = 2;
        while (true) {
            d = arc.getNextP(x,y,d);
            x = x+dx[d];
            y = y+dy[d];
            System.out.print(direction[d]);
            if (x == 0 && y == 0){
                System.out.println();
                break;
            }
        }
    }

    class Arc {
        int[][] arc;
        Scanner sc;
        int size;
        Arc(int size) {
            this.size = size;
            sc = new Scanner(System.in);
            arc = new int [2*(size+1)+1][size+2];
            for (int i=0;i<2*(size+1)+1;i++) {
                for (int j=0;j<size+2;j++) arc[i][j] = 0;
            }
            String line;
            for (int i=2;i<2*size+1;i++) {
                line = sc.next();
                if (i%2 == 0) {
                    for (int j=1;j<size;j++)
                        arc[i][j] = line.charAt(j-1)-'0';
                }
                else {
                    for (int j=1;j<size+1;j++)
                        arc[i][j] = line.charAt(j-1)-'0';
                }
            }
        }

        int[] dx = {1,1,1,0};
        int[] dy = {-1,0,1,0};
        int getNextP(int x,int y, int d) {
            for (int i=3;i<7;i++) {
                if (arc[2*(y+1)+dy[(d+i)%4]][x+dx[(d+i)%4]] == 1) return (d+i)%4;
            }
            return -1;
        }
        void printArc() {
            for (int i=0;i<2*(size+1)+1;i++) {
                for (int j=0;j<size+2;j++) {
                    System.out.print(arc[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}