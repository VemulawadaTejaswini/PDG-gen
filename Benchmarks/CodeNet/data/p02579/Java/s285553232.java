import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Deque;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        int H=scan.nextInt();
        int W=scan.nextInt();
        int Ch=scan.nextInt()-1;
        int Cw=scan.nextInt()-1;
        int Dh=scan.nextInt()-1;
        int Dw=scan.nextInt()-1;
char S[][]=new char[H][W];
int c[][]=new int [H] [W];
for(int i=0;i<H;i++){
    for(int j=0;j<W;j++){
        c[i][j]=-1;
    }
}
Deque<XY> q=new ArrayDeque<>();
        Deque<XY> p=new ArrayDeque<>();
for(int i=0;i<H;i++){
    S[i]=scan.next().toCharArray();
    }
q.add(new XY(Ch,Cw));
        p.add(new XY(Ch,Cw));



        c[Ch][Cw]=0;
for(int depth=0;;depth++) {
    for (; ; ) {


        if (q.size() < 1) {
            break;
        }


        XY xy = q.poll();
        int x = xy.x;
        int y = xy.y;

        if (x + 1 < W ) {if( S[y][x + 1] == '.'&&c[y][x+1]==-1){
            q.add(new XY(y, x + 1));
            p.add(new XY(y, x + 1));

            c[y][x + 1] = depth;
        }}
        if (x - 1 >= 0 ) {if( S[y][x - 1] == '.'&&c[y][x-1]==-1){
            q.add(new XY(y, x - 1));
            p.add(new XY(y, x - 1));
            c[y][x - 1] = depth;
        }}
        if (y + 1 < H ) {if( S[y + 1][x] == '.'&&c[y+1][x]==-1){
            q.add(new XY(y + 1, x));
            p.add(new XY(y + 1, x));
            c[y + 1][x] = depth;
        }}
        if (y - 1 >= 0 ) {if( S[y - 1][x] == '.'&&c[y-1][x]==-1){
            q.add(new XY(y - 1, x));
            p.add(new XY(y - 1, x));
            c[y - 1][x] = depth;
        }}

    }
for(;;){if(p.size()<1){break;}
    XY rt = p.poll();
    int j = rt.x;
    int i = rt.y;

            if (i - 1 >= 0) {
                if (c[i - 1][j] == -1 && S[i - 1][j] == '.') {
                    c[i - 1][j] = depth + 1;
                    q.add(new XY(i - 1, j));
                }
            }

            if (i - 2 >= 0) {
                if (c[i - 2][j] == -1 && S[i - 2][j] == '.') {
                    c[i - 2][j] = depth + 1;
                    q.add(new XY(i - 2, j));
                }
            }

            if (i - 1 >= 0 && j - 1 >= 0) {
                if (c[i - 1][j - 1] == -1 && S[i - 1][j - 1] == '.') {
                    c[i - 1][j - 1] = depth + 1;
                    q.add(new XY(i - 1, j - 1));
                }
            }


            if (i - 2 >= 0 && j - 1 >= 0) {
                if (c[i - 2][j - 1] == -1 && S[i - 2][j - 1] == '.') {
                    c[i - 2][j - 1] = depth + 1;
                    q.add(new XY(i - 2, j - 1));
                }
            }

            if (i - 1 >= 0 && j + 1 < W) {
                if (c[i - 1][j + 1] == -1 && S[i - 1][j + 1] == '.') {
                    c[i - 1][j + 1] = depth + 1;
                    q.add(new XY(i - 1, j + 1));
                }
            }
            if (i - 2 >= 0 && j + 1 < W) {
                if (c[i - 2][j + 1] == -1 && S[i - 2][j + 1] == '.') {
                    c[i - 2][j + 1] = depth + 1;
                    q.add(new XY(i - 2, j + 1));
                }
            }
            if (i - 1 >= 0 && j + 2 < W) {
                if (c[i - 1][j + 2] == -1 && S[i - 1][j + 2] == '.') {
                    c[i - 1][j + 2] = depth + 1;
                    q.add(new XY(i - 1, j + 2));
                }
            }

            if (i - 2 >= 0 && j + 2 < W) {
                if (c[i - 2][j + 2] == -1 && S[i - 2][j + 2] == '.') {
                    c[i - 2][j + 2] = depth + 1;
                    q.add(new XY(i - 2, j + 2));
                }
            }

            if (j - 2 >= 0) {
                if (c[i][j - 2] == -1 && S[i][j - 2] == '.') {
                    c[i][j - 2] = depth + 1;
                    q.add(new XY(i, j - 2));
                }
            }

            if (j - 1 >= 0) {
                if (c[i][j - 1] == -1 && S[i][j - 1] == '.') {
                    c[i][j - 1] = depth + 1;
                    q.add(new XY(i, j - 1));
                }
            }


            if (j + 1 < W) {
                if (c[i][j + 1] == -1 && S[i][j + 1] == '.') {
                    c[i][j + 1] = depth + 1;
                    q.add(new XY(i, j + 1));
                }
            }

            if (j + 2 < W) {
                if (c[i][j + 2] == -1 && S[i][j + 2] == '.') {
                    c[i][j + 2] = depth + 1;
                    q.add(new XY(i, j + 2));
                }
            }

            if (i + 1 < H) {
                if (c[i + 1][j] == -1 && S[i + 1][j] == '.') {
                    c[i + 1][j] = depth + 1;
                    q.add(new XY(i + 1, j));
                }
            }

            if (i + 2 < H) {
                if (c[i + 2][j] == -1 && S[i + 2][j] == '.') {
                    c[i + 2][j] = depth + 1;
                    q.add(new XY(i + 2, j));
                }
            }

            if (i + 1 < H && j - 1 >= 0) {
                if (c[i + 1][j - 1] == -1 && S[i + 1][j - 1] == '.') {
                    c[i + 1][j - 1] = depth + 1;
                    q.add(new XY(i + 1, j - 1));
                }
            }

            if (i + 2 < H && j - 1 >= 0) {
                if (c[i + 2][j - 1] == -1 && S[i + 2][j - 1] == '.') {
                    c[i + 2][j - 1] = depth + 1;
                    q.add(new XY(i + 2, j - 1));
                }
            }

            if (i + 1 < H && j - 2 >= 0) {
                if (c[i + 1][j - 2] == -1 && S[i + 1][j - 2] == '.') {
                    c[i + 1][j - 2] = depth + 1;
                    q.add(new XY(i + 1, j - 2));
                }
            }

            if (i + 2 < H && j - 2 >= 0) {
                if (c[i + 2][j - 2] == -1 && S[i + 2][j - 2] == '.') {
                    c[i + 2][j - 2] = depth + 1;
                    q.add(new XY(i + 2, j - 2));
                }
            }

            if (i + 1 < H && j + 1 < W) {
                if (c[i + 1][j + 1] == -1 && S[i + 1][j + 1] == '.') {
                    c[i + 1][j + 1] = depth + 1;
                    q.add(new XY(i + 1, j + 1));
                }
            }

            if (i + 2 < H && j + 1 < W) {
                if (c[i + 2][j + 1] == -1 && S[i + 2][j + 1] == '.') {
                    c[i + 2][j + 1] = depth + 1;
                    q.add(new XY(i + 2, j + 1));
                }
            }

            if (i + 1 < H && j + 2 < W) {
                if (c[i + 1][j + 2] == -1 && S[i + 1][j + 2] == '.') {
                    c[i + 1][j + 2] = depth + 1;
                    q.add(new XY(i + 1, j + 2));
                }
            }

            if (i + 2 < H && j + 2 < W) {
                if (c[i + 2][j + 2] == -1 && S[i + 2][j + 2] == '.') {
                    c[i + 2][j + 2] = depth + 1;
                    q.add(new XY(i + 2, j + 2));
                }
            }
            if (i - 2 >= 0 && j - 2 >= 0) {
                if (c[i - 2][j - 2] == -1 && S[i - 2][j - 2] == '.') {
                    c[i - 2][j - 2] = depth + 1;
                    q.add(new XY(i - 2, j - 2));
                }
            }
            if (i - 1 >= 0 && j - 2 >= 0) {
                if (c[i - 1][j - 2] == -1 && S[i - 1][j - 2] == '.') {
                    c[i - 1][j - 2] = depth + 1;
                    q.add(new XY(i - 1, j - 2));
                }
            }
        }


    if(q.size()<1){break;}

}
   System.out.println(c[Dh][Dw]);
    }}
class XY{
    int y;
    int x;
    XY(int y,int x){
    this.x=x;
    this.y=y;
}}