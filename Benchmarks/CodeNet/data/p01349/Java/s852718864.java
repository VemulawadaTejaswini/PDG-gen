import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static char[][] map;
    static char[][] moveMap;
    static boolean[][] markMap;

    public static void main(String[] args) {
        int h=s.nextInt();
        int w=s.nextInt();
        int n=s.nextInt();

        map = new char[h][w];
        moveMap = new char[h][w];
        markMap = new boolean[h][w];

        makeMap(h, w);

        boolean flag=changeMap(h,w,n);

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void makeMap(int h, int w){
        for (int i=0;i<h;i++){
            String line=s.next();
            for(int j=0;j<w;j++){
                map[i][j]=line.charAt(j);
            }
        }
    }

    public static boolean changeMap(int h,int w, int n){
        boolean flag=false;
        for (int i=0;i<h;i++){
            for(int j=0;j<w-1;j++){
                if(map[i][j]=='.' || map[i][j+1]=='.') continue;
                if(map[i][j]==map[i][j+1]) continue;

                flag= move(h, w, n, i, j);
                if(flag) return flag;
            }
        }
        return flag;
    }

    public static boolean move(int h, int w, int n, int y, int x){
        boolean fullvanish=true;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                moveMap[i][j]=map[i][j];
                markMap[i][j]=false;
            }
        }
        char temp=moveMap[y][x];
        moveMap[y][x]=moveMap[y][x+1];
        moveMap[y][x+1]=temp;

        while (true){
            check(h,w,n,1);
            check(h,w,n,2);
            if(vanish(h,w)) break;
            full(h,w);
        }

        for(int j=0;j<w;j++){
            if(moveMap[h-1][j]=='.')continue;
            fullvanish=false;
        }
        return fullvanish;
    }

    public static void check(int h,int w,int n,int mode){
        if(mode==1) {
            for (int i = 0; i < h; i++) {
                char now = moveMap[i][0];
                int count = 1;
                for (int j = 1; j < w; j++) {
                    if (moveMap[i][j] == '.') continue;
                    if (now == moveMap[i][j]) {
                        count++;
                    } else {
                        if (count >= n) mark(i, j-1, 1);
                        count = 1;
                        now = moveMap[i][j];
                    }
                }
                if (count >= n) mark(i, w - 1, 1);
            }
        } else{
            for (int j = 0; j < w; j++) {
                char now = moveMap[0][j];
                int count = 1;
                for (int i = 1; i < h; i++) {
                    if (moveMap[i][j] == '.') continue;
                    if (now == moveMap[i][j]) {
                        count++;
                    } else {
                        if (count >= n) mark(i-1, j, 2);
                        count = 1;
                        now = moveMap[i][j];
                    }
                }
                if (count >= n) mark(h-1, j, 2);
            }
        }
    }

    public static void mark(int y, int x, int mode){
        char now=moveMap[y][x];

        if(mode==1){
            for(int j=x;j>=0;j--){
                if(moveMap[y][j]==now) markMap[y][j]=true;
                else break;
            }
        }else{
            for (int i=y;i>=0;i--){
                if(moveMap[i][x]==now) markMap[i][x]=true;
                else break;
            }
        }
    }

    public static boolean vanish(int h,int w){
        boolean flag=true;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(markMap[i][j]){
                    moveMap[i][j]='.';
                    markMap[i][j]=false;
                    flag=false;
                }
            }
        }
        return flag;
    }

    public static void full(int h,int w){
        for(int j=0;j<w;j++){
            int num=0;
            for(int i=h-1;i>=0;i--){
                if(!(moveMap[i][j]=='.')) continue;
                moveMap[num][j]=moveMap[i][j];
                moveMap[i][j]='.';
                num++;
            }
        }
    }
}