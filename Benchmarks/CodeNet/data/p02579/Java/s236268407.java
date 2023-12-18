import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
 
public class Main
{
    static int h;
    static int w;
    static int ch;
    static int cw;
    static int dh;
    static int dw;
    static boolean[][] visited;
    static char[][] mat;
    static int V;
    static LinkedList<Integer> adj[];
    static HashMap<Integer, Integer> map=new HashMap<>();
    static HashMap<Integer, Queue<Integer>> comp=new HashMap<>();
    static boolean isValid(int x, int y)
    {
        if(x>=0 && x<h && y>=0 && y<w && !visited[x][y] && mat[x][y]=='.')
            return true;
        return false;
    }
    static void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
    static void dfs(int x, int y, int cnt)
    {
        visited[x][y]=true;
        map.put(w*x+y,cnt);
        if(comp.containsKey(cnt))
        {
            Queue<Integer> Q=comp.get(cnt);
            Q.add(w*x+y);
            comp.put(cnt,Q);
        }
        else
        {
            Queue<Integer> Q=new LinkedList<>();
            Q.add(w*x+y);
            comp.put(cnt,Q);
        }
        if(isValid(x+1,y))
            dfs(x+1,y,cnt);
        if(isValid(x-1,y))
            dfs(x-1,y,cnt);
        if(isValid(x,y+1))
            dfs(x,y+1,cnt);
        if(isValid(x,y-1))
            dfs(x,y-1,cnt);
    }
    static void BFS(int s) 
    { 
        boolean visited[] = new boolean[V+1]; 
        int[] dist=new int[V+1];
        for(int i=0;i<=V;i++)
            dist[i]=-1;
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[s]=true; 
        queue.add(s); 
        dist[s]=0;
        //System.out.println(s);
        while (queue.size() != 0) 
        { 
            s = queue.poll();  
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                    dist[n]=dist[s]+1;
                } 
            } 
        } 
        System.out.println(dist[map.get(dh*w+dw)]);
    } 
    static void constructGraph()
    {
        for(int i=1;i<=V;i++)
        {
            /*Queue<Integer> Q=comp.get(i);
            System.out.print(i+": ");
            for(int elem: Q)
                System.out.print(elem+" ");
            System.out.println();*/
            Queue<Integer> Q=comp.get(i);
            //System.out.print(i+": ");
            for(int j: Q)
            {
                int x=j/w;
                int y=j%w;
                for(int r=Math.max(0,x-2);r<=Math.min(h-1,x+2);r++)
                {
                    for(int c=Math.max(0,y-2);c<=Math.min(w-1,y+2);c++)
                    {
                        if(map.containsKey(w*r+c) && map.get(w*r+c)!=i)
                        {
                            //System.out.println(w*r+c);
                            addEdge(map.get(w*r+c),i);
                        }
                    }
                }
                
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        h=in.nextInt();
        w=in.nextInt();
        ch=in.nextInt();
        cw=in.nextInt();
        dh=in.nextInt();
        dw=in.nextInt();
        ch--;
        cw--;
        dh--;
        dw--;
        mat=new char[h][w];
        visited=new boolean[h][w];
        for(int i=0;i<h;i++)
        {
            String str=in.next();
            for(int j=0;j<w;j++)
                mat[i][j]=str.charAt(j);
        }
        int cnt=1;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(!visited[i][j] && mat[i][j]=='.')
                {
                    dfs(i,j,cnt);
                    cnt++;
                }
            }
        }
        //System.out.println(cnt);
        V=cnt-1;
        /*for(int i=0;i<=w*h-1;i++)
        {
            if(map.containsKey(i))
                System.out.println(i);
        }*/
        adj = new LinkedList[V+1]; 
        for (int i=0; i<=V; ++i) 
            adj[i] = new LinkedList(); 
        constructGraph();
        for(int i=1;i<=V;i++)
        {
            Iterator<Integer> j = adj[i].listIterator();
            //System.out.print(i+": ");
            while(j.hasNext())
            {
                int n=j.next();
                //System.out.print(n+" ");
            }
            //System.out.println();
        }
        BFS(map.get(ch*w+cw));
    }
}