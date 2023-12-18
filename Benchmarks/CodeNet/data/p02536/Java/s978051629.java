import java.util.*;
public class Main{
    public static void dfs(boolean b[],ArrayList<Integer> ar[],int i)
    {
        b[i]=true;
        for(int k:ar[i])
        {
            dfs(b,ar,k);
        }
    }
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
    
   int n=sc.nextInt();
   int m=sc.nextInt();
   
   ArrayList<Integer> ar[]=new ArrayList[n];
   for(int i=0;i<n;i++)ar[i]=new ArrayList<>();
   
   
   
   for(int i=0;i<m;i++)
   {
    int a=sc.nextInt();
     int b=sc.nextInt();
     ar[a-1].add(b-1);
     ar[a-1].add(b-1);
   }
   
   boolean b[]=new boolean[n];
   int t=0;
   for(int i=0;i<n;i++)
   {
       if(!b[i])
       {
           t++;
           dfs(b,ar,i);
       }
   }
     System.out.println(t-1);
   
   
   
   
   
  
   
 }
}