import java.util.*;

public class Main 
{
    static int dfs(int n , LinkedList<Integer> arr[] , boolean visited[])
    {
        visited[n] = true;
        int tot = 0;
        for(Integer i : arr[n])
        {
            if(!visited[i])
            {
               tot += dfs(i,arr,visited); 
            }
        }
        return tot+1;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        TreeMap<edge,Integer> map = new TreeMap<edge,Integer>(new Compare());
        LinkedList<Integer> arr[] = new LinkedList[n+1];
        boolean visited[] = new boolean[n+1];
        for(int i = 1 ; i <= n ; i++)
        {
            visited[i] = false;
            arr[i] = new LinkedList<Integer>();
        }
        for(int i = 0 ; i < m ; i++)
        {
             int x = sc.nextInt();
             int y = sc.nextInt();
             
             edge temp = new edge(x,y);
             
             if(map.containsKey(temp))
             continue;
             
             else
             {
                 map.put(temp,1);
                 arr[x].add(y);
                 arr[y].add(x);
             }
        }
        int max = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(!visited[i])
            {
                max = Math.max(max , dfs(i,arr,visited));
            }
        }
        System.out.println(max);
    }
}

class edge
{
    int x , y;
    public edge(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Compare implements Comparator<edge>
{
    public int compare(edge a , edge b)
    {
        if(a.x != b.x)
        return a.x-b.x;
        
        
        return a.y-b.y;
    }
}