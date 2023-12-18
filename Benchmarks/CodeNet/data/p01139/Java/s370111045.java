import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w+h==0)break;
            int[][] a = new int[h][w];
            for (int i = 0; i < a.length; i++) {
                String s = sc.next();
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j]=s.charAt(j);
                }
            }
            int bs = 0,ws=0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if(a[i][j]!='.')continue;
                    int[] res = rec(a,i,j);
                    if(res[1]==1){
                        bs+=res[0];
                    } else if(res[1]==2){
                        ws+=res[0];                        
                    }
                }
            }
            System.out.println(bs+" "+ws);
        }
    }
    static int[] v1 = {0,0,1,-1};
    static int[] v2 = {1,-1,0,0};
    static int[] rec(int[][] a,int h,int w){
        int[] res = new int[2];
        Queue<int[]>q = new LinkedList<int[]>();
        a[h][w]=-1;
        q.add(new int[]{h,w});
        while(!q.isEmpty()){
            int y = q.peek()[0];
            int x = q.poll()[1];
            res[0]++;
            for (int i = 0; i < v1.length; i++) {
                int yy = y + v1[i];
                int xx = x + v2[i];
                try {
                    a[yy][xx]*=1;
                } catch (Exception e) {
                    continue;
                }
                if(a[yy][xx]=='B'){
                    res[1]|=1;
                } else if(a[yy][xx]=='W'){
                    res[1]|=2;
                } else if(a[yy][xx]==-1){
                    continue;
                } else {
                    a[yy][xx]=-1;
                    q.add(new int[]{yy,xx});
                }
            }
        }
        return res;
    }
}