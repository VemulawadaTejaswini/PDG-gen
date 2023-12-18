import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(h==0&&w==0) break;
            //int[][] s=new int[h][w];
            int n=h*w;
            ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<n;i++){
                g.add(new ArrayList<Integer>());
            }
            //int[] ok=new int[n];
            for(int i=0;i<2*h-1;i++){
                int m;
                if(i%2==0){
                    m=w-1;
                }else{
                    m=w;
                }
                for(int j=0;j<m;j++){
                    int aa=sc.nextInt();
                    if(aa==0){
                        int z=i/2;
                        if(i%2==0){
                            if(z*w+j>=0&&z*w+j<n&&z*w+j+1>=0&&z*w+j+1<n){
                                g.get(z*w+j).add(z*w+j+1);
                                g.get(z*w+j+1).add(z*w+j);
                            } 
                            
                        }else{
                            if(z*w+j>=0&&z*w+j<n&&(z+1)*w+j>=0&&(z+1)*w+j<n){
                                g.get(z*w+j).add((z+1)*w+j);
                                g.get((z+1)*w+j).add(z*w+j);
                            }
                        }
                    }
                }
            }
            /*for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    int now=i*w+j;
                    //G[now]=new ArrayList();
                    
                    if(s[i][j]==1){
                        ok[now]=1;
                        for(int x=-1;x<=1;x++){
                            for(int y=-1;y<=1;y++){
                                if(x==0&&y==0) continue;
                                if(i+x>=0&&i+x<h&&j+y>=0&&j+y<w){
                                    if(s[i+x][j+y]==1)g.get(now).add(w*(i+x)+j+y);
                                }
                            }
                        }
                    }
                }
            }*/
            //int ans=0;
            //System.out.println(-10000);
            int[] dist=new int[n];
            for(int i=0;i<n;i++) dist[i]=-1;
            Queue<Integer> que=new LinkedList<Integer>();
            dist[0]=0;
            que.add(0);
            while(!que.isEmpty()){
                int v=que.poll();
                for(int nv:g.get(v)){
                    if(nv>=0&&nv<n&&dist[nv]==-1){
                        dist[nv]=dist[v]+1;
                        que.add(nv);
                    }
                }
            }
            //if(dist[n-1]==-1) dist[n-1]=0;
            System.out.println(dist[n-1]+1);
        }
    }
}
