import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
   
   static class State implements Comparable<State>{
       int v,cost;
       State(int v, int cost){
           this.v=v;
           this.cost=cost;
       }
       public int compareTo(State s) {
           return this.cost-s.cost;
       }
       
   }
   
   public static void main(String args[]){
       try(Scanner sc=new Scanner(System.in)){
           while(sc.hasNext()) {
               int n=sc.nextInt();
               if(n==0) break;
               
               int max=0;
               int[][] d=new int[10][10];
               int INF=100000000;
               for(int i=0; i<=9; i++) {
                   for(int j=0; j<=9; j++) {
                       d[i][j]=INF;
                   }
               }
               for(int i=1; i<=n; i++) {
                   int a=sc.nextInt();
                   int b=sc.nextInt();
                   int c=sc.nextInt();
                   max=Math.max(max, Math.max(a, b));
                   d[a][b]=d[b][a]=c;
               }
               
               PriorityQueue<State> pq=new PriorityQueue<>();
               int smin=INF;
               int num=0;
               for(int i=0; i<=max; i++) {
                   int[] dc=new int[10];
                   Arrays.fill(dc, INF);
                   dc[i]=0;
                   pq.add(new State(i, 0));
                   
                   while(! pq.isEmpty()) {
                       State state=pq.remove();
                       dc[state.v]=state.cost;
                       
                       for(int j=0; j<=max; j++) {
                           if(d[state.v][j]!=INF && state.cost+d[state.v][j]<dc[j]) {
                               dc[j]=state.cost+d[state.v][j];
                               pq.add(new State(j, dc[j]));
                           }
                       }
                   }
                   int sum=0;
                   for(int j=0; j<=max; j++) {
                       sum+=dc[j];
                   }
                   if(smin>sum) {
                       num=i;
                       smin=sum;
                   }
                   
               }
               System.out.println(num+" "+smin);
               
           }
       }
   }
}
