

import java.util.*;

public class Main {
    static boolean[] vis;
    static List<Integer> list=new ArrayList<>();
    static int min=Integer.MAX_VALUE;
    static boolean[] visited;
    static int[] ans;
    static void dfs(LinkedList<Integer>[] lin,int src){
        if(src==1){
            if(list.size()<min) {
                visited=new boolean[ans.length];

                List<Integer> lis=new ArrayList<>();
                for(int j=0;j<list.size();j++){
                    visited[list.get(j)]=true;
                    lis.add(list.get(j));
                }
                min=lis.size();
                for(int j=0;j<lis.size()-1;j++){
                    ans[lis.get(j)]=lis.get(j+1);
                }
                //System.out.println(lis.get(lis.size()-1));
                int ss=lis.get(lis.size()-1);
                ans[ss]=1;
            }
            return;
        }
        vis[src]=true;
        list.add(src);
        for(Integer i:lin[src]){
            if(!vis[i]){
                dfs(lin,i);
            }
        }
        list.remove(list.size()-1);
        vis[src]=false;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m=scanner.nextInt();
        LinkedList<Integer>[] lin=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            lin[j]=new LinkedList<>();
        }
        vis=new boolean[n+1];
        ans=new int[n+1];
        visited=new boolean[n+1];
        for(int j=0;j<m;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            lin[a].add(b);
            lin[b].add(a);

        }
        Arrays.fill(ans,-1);
        list=new ArrayList<>();
        for(int j=n;j>1;j--){
           if(!visited[j]){
                vis=new boolean[n+1];
                list=new ArrayList<>();
                min=Integer.MAX_VALUE;
                dfs(lin,j);
            }
        }
       // StringBuilder stringBuilder=new StringBuilder();
        int ff=0;
        for(int j=2;j<ans.length;j++){
            if(ans[j]==-1){
                ff=1;
                break;
            }

        }
        if(ff==1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
            for(int j=2;j<ans.length;j++){
                System.out.println(ans[j]);
            }
        }


    }

}
