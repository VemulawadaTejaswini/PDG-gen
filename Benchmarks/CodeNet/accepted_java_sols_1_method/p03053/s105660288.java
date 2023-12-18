import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] dat;
    static int n=1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        int H = sc.nextInt(), W = sc.nextInt();
        int[][] grid = new int[H][W];
        List<int[]> que = new LinkedList<>(), next = new LinkedList<>();
        for(int i=0;i<H;i++){
            char[] s = sc.next().toCharArray();
            for(int j=0;j<W;j++){
                if(s[j]=='#') {
                    grid[i][j]=1;
                    que.add(new int[]{i,j});
                }
            }
        }
        if(que.size()==H*W){
            System.out.println(0);
            return;
        }
        int step = 0;
        int[] dr = new int[]{1,0,-1,0}, dc=new int[]{0,1,0,-1};
        while(que.size()>0){
            for(int[] w:que){
                for(int i=0;i<4;i++){
                    int r=w[0]+dr[i], c=w[1]+dc[i];
                    if(r>=0&&r<H&&c>=0&&c<W&&grid[r][c]==0){
                        next.add(new int[]{r,c});
                        grid[r][c]=1;
                    }
                }
            }
            step++;
            que=next;
            next = new LinkedList<>();
        }
        System.out.println(step-1);
    }
}
