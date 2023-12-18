import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static int num;
    static int[][] map = new int[61][61];

    static void move(int x,int y,int tern){
        if(x<-30 || 30<x || y<-30 || 30<y) return;
        if(map[x+30][y+30]<0) return;
        if(map[x+30][y+30]==0) num++;
        map[x+30][y+30]=1;
        if(tern==0) return;
        move(x+1,y+1,tern-1);
        move(x+1,y,tern-1);
        move(x,y+1,tern-1);
        move(x,y-1,tern-1);
        move(x-1,y,tern-1);
        move(x-1,y-1,tern-1);
    }

    public static void main(String[] args) {
        int tern,object;

        int x,y;

        while(true) {
            tern = s.nextInt();
            object = s.nextInt();

            if(tern==0 && object==0) break;

            for(int i=0;i<61;i++){
                for(int j=0;j<61;j++)
                    map[i][j]=0;
            }
            num=0;

            for (int i = 0; i < object; i++) {
                x = s.nextInt();
                y = s.nextInt();

                map[x + 30][y + 30] = -1;
            }

            x = s.nextInt();
            y = s.nextInt();

            move(x, y, tern);

            System.out.println(num);
        }
    }
}