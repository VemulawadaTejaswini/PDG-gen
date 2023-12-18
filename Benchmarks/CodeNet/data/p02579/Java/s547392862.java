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
    static char[][] mat;
    static boolean[][] visited;
    static int[][] comp;
    static int h;
    static int w;
    static int ch;
    static int cw;
    static int dh;
    static int dw;
    static int V;   // No. of vertices 
    static LinkedList<Integer> adj[];
    static boolean isValid(int x, int y)
    {
        if(x>=0 && x<h && y>=0 && y<w && !visited[x][y] && mat[x][y]=='.')
            return true;
        return false;
    }
    static void dfs(int x, int y, int cnt)
    {
        visited[x][y]=true;
        comp[x][y]=cnt;
        if(isValid(x+1,y))
            dfs(x+1,y,cnt);
        if(isValid(x-1,y))
            dfs(x-1,y,cnt);
        if(isValid(x,y+1))
            dfs(x,y+1,cnt);
        if(isValid(x,y-1))
            dfs(x,y-1,cnt);
    }
    static void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
        adj[w].add(v);
    } 
    static void solve(int x, int y)
    {
        for(int i=Math.max(0,x-2);i<=Math.min(h-1,x+2);i++)
        {
            for(int j=Math.max(0,y-2);j<=Math.min(w-1,y+2);j++)
            {
                if(comp[i][j]!=comp[x][y])
                    addEdge(comp[i][j],comp[x][y]);
            }
        }
    }
    static int BFS(int s, int dest) 
    { 
        boolean visited[] = new boolean[V];
        int dist[] = new int[V];  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[s]=true; 
        queue.add(s); 
        dist[s]=0;
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
        return dist[dest]; 
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
        comp=new int[h][w];
        for(int i=0;i<h;i++)
        {
            String s=in.next();
            for(int j=0;j<s.length();j++)
            {
                mat[i][j]=s.charAt(j);
                //System.out.print(mat[i][j]);
            }
            //System.out.println();
        }
        int cnt=0;
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
        V=cnt;
        adj = new LinkedList[V]; 
        for (int i=0; i<V; ++i) 
            adj[i] = new LinkedList(); 
        for(int k=0;k<cnt;k++)
        {
            for(int i=0;i<h;i++)
            {
                for(int j=0;j<w;j++)
                {
                    if(comp[i][j]==k && mat[i][j]=='.')
                    {
                        solve(i,j);
                    }
                }
            }
        }
        int src=comp[ch][cw];
        int dst=comp[dh][dw];
        if(src==dst)
            System.out.println(0);
        else
        {
            System.out.println(BFS(src,dst));
        }

    }
}
