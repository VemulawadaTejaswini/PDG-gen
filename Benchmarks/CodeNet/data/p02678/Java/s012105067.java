
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++)
            graph.add(new ArrayList<>());
        for(int i=0;i<m;i++){
            st=new StringTokenizer(in.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        int solution[]=new int[n+1];
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[n+1];
        q.add(1);
        visited[1]=true;
        while(!q.isEmpty()){
            int start=q.remove();
            int t=graph.get(start).size();
            for(int i=0;i<t;i++){
                int x=graph.get(start).get(i);
                if(!visited[x]){
                    q.add(x);
                    visited[x]=true;
                    solution[x]=start;
                }
            }
        }
        boolean flag=true;
        for(int i=1;i<=n;i++)
            if(!visited[i]){
                flag=false;
                break;
            }
        if(!flag)
            System.out.println("No");
        else{
            System.out.println("Yes");
            for(int i=2;i<=n;i++)
                System.out.println(solution[i]+" ");
        }
    }
}
