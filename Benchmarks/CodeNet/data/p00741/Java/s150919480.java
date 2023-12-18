import java.util.Scanner;

public class Main {
    static int[][] data;
    static boolean[][] check;

    static int W,H;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            W = sc.nextInt();
            H = sc.nextInt();
            if(W==0&&H==0) return;
            data = new int[H][W];
            check = new boolean[H][W];
            int count = 0;
            for (int i = 0; i < H; i++)
            {
                for (int j = 0; j < W; j++) {
                    data[i][j] = sc.nextInt();
                    check[i][j] = false;
                }
            }
            for(int h=0;h<H;h++)
            {
                for(int w=0;w<W;w++)
                {
                    if(!check[h][w])
                    {
                        if(checkAround(h,w))
                            count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

    static boolean checkAround(int x,int y)
    {
        if(data[x][y]==0||check[x][y]) return false;
        check[x][y] = true;
        if(x!=0) checkAround(x-1,y);
        if(y!=0)checkAround(x,y-1);
        if(x!=H-1)checkAround(x+1,y);
        if(y!=W-1)checkAround(x,y+1);
        if(x!=0&&y!=0)checkAround(x-1,y-1);
        if(x!=0&&y!=W-1)checkAround(x-1,y+1);
        if(x!=H-1&&y!=0)checkAround(x+1,y-1);
        if(x!=H-1&&y!=W-1)checkAround(x+1,y+1);
        return true;
    }
}