import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][2];
    for(int i=0;i<n;i++){
      a[i][0]=sc.nextInt();
      a[i][1]=sc.nextInt();
    }
    Arrays.sort(a,Comparator.comparingInt(o->o[0]));
    long ans = 0;
    int j = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i=1;i<=m;i++){
      while(j<n&&a[j][0]<=i){
        pq.add(a[j][1]);
        j++;
      }
      if(!pq.isEmpty())ans+=(long)pq.poll();
    }
    System.out.println(ans);
  }
}