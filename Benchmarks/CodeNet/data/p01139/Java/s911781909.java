import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    static boolean black,white;
    static char[][] map;
    static int W,H;

    public static void main(String[] args) {
        int count;
        while (true) {
            W = s.nextInt();
            H = s.nextInt();
            if (W == 0 && H == 0) break;

            int bCount=0,wCount=0;
            map = new char[H][W];

            for (int i = 0; i < H; i++) {
                map[i] = s.next().toCharArray();
            }

            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    black=false;
                    white=false;
                    count=0;

                    if(map[i][j]=='.')
                        count=search(i,j);

                    if(black && !white)
                        bCount+=count;
                    else if(!black && white)
                        wCount+=count;
                }
            }
            System.out.println(bCount+" "+wCount);
        }
    }

    static int search(int i,int j) {
        int count=0;
        if(i<0 || i>=H || j<0 || j>=W) return 0;
        if(map[i][j]=='.'){
            map[i][j]='x';
            count++;
            count+=search(i+1,j)+search(i-1,j)+search(i,j+1)+search(i,j-1);
        }else if(map[i][j]=='B'){
            black=true;
        }else if(map[i][j]=='W'){
            white=true;
        }
        return count;
    }
}