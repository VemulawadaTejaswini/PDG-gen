import java.util.*;


public class Main{

    public static edge[][] V=new edge[30][30];
    public static int[] Vs=new int[30];
    public static int[] ti=new int[30];
    public static Boolean[][] vis=new Boolean[30][1<<8];
    
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);

        while(true){
            int n=cin.nextInt();
            if(n==0)break;
            int m=cin.nextInt();
            int p=cin.nextInt();
            int a=cin.nextInt()-1;
            int b=cin.nextInt()-1;
            for(int i=0;i<n;i++)ti[i]=cin.nextInt();

            for(int i=0;i<m;i++)Vs[i]=0;

            for(int i=0;i<p;i++){
                int x=cin.nextInt()-1;
                int y=cin.nextInt()-1;
                int z=cin.nextInt();
                V[x][Vs[x]++]=new edge(y,z);
                V[y][Vs[y]++]=new edge(x,z);
            }
            Queue<node> q=new PriorityQueue<node>();
            q.add(new node(0,a,0));


            for(int i=0;i<m;i++)
                for(int j=0;j<(1<<n);j++)vis[i][j]=false;
            
            double ans=-1;
            
            while(q.isEmpty()==false){
                node cn=q.poll();


                if(vis[cn.v][cn.st]==true)continue;
                vis[cn.v][cn.st]=true;
                if(cn.v==b){
                    ans=cn.cc;
                    break;
                }

                for(int i=0;i<n;i++){
                    if(((cn.st>>i)&1)==1)continue;
                    for(int j=0;j<Vs[cn.v];j++){
                        int nv=V[cn.v][j].v;
                        int tc=V[cn.v][j].c;
                        int nst=cn.st|(1<<i);
                        if(vis[nv][nst])continue;
                        double nc=cn.cc+1.0*tc/ti[i];
                        q.add(new node(nc,nv,nst));
                    }
                }
            }
            if(ans<0)System.out.println("Impossible");
            else System.out.println(ans);
        }
    }

    public static class edge{
        public int v,c;
        public edge(int iv,int ic){
            v=iv;
            c=ic;
        }
    }

    public static class node implements Comparable{
        public double cc;
        public int v,st;
        public node(double icc,int iv,int ist){
            cc=icc;
            v=iv;
            st=ist;
        }
        public int compareTo(Object object){
            node coto=(node)object;

            return new Double(this.cc).compareTo(new Double(coto.cc));
        }
    }
}