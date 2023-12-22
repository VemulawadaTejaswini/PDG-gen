import java.util.*;
import java.io.*;

public class Main{
    static int INFTY = Integer.MAX_VALUE;
        
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    try{
    //        int n = Integer.parseInt(br.readLine());

            //「探索済み集合V」に頂点を一つずつ入れていく
            int[] color = new int[n];   //0:未探索, -1:探索中(周辺), +1:全域木に追加済
            int[][] M = new int[n][n];
            int[] d = new int[n];       //Vからの最短距離
            int[] p =new int[n];       //親(一意に定まる)を記録
            for (int i=0;i<n;i++){
                d[i]=INFTY;
            }
            p[0] =-1;
            d[0]=0;

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    M[i][j]=sc.nextInt();
                }
            }

            int u=0;        //Vに追加する頂点
            while(true){
                int mincost=INFTY;
                for(int i=0;i<n;i++){
                    if (color[i]!=1 && d[i]<mincost){
                        mincost=d[i];
                        u=i;                            //Vから一番近い頂点を選択
                    }
                }
                if (mincost==INFTY){                    //すべて探索済みだったら終了
                    break;
                }
                color[u]=1;                             //uを探索済みにする

                for(int i=0;i<n;i++){
                    if(color[i]!=1&&M[u][i]!=-1){       //uと結ばれている頂点について、d[]が更新できるなら更新し、親をuとする
                        if(M[u][i]<d[i]){
                            d[i]=M[u][i];
                            p[i]=u;
                            //color[i]=-1;　            ←本には載ってたけどこれいらなくない？
                        }
                    }
                }
            }
            int ans=0;
            for(int i=0;i<n;i++){
                ans+=d[i];
            }
            System.out.println(ans);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        
    }
    
}


    
