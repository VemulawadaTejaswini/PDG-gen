import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      long ans = 0;

      PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

      long[] a = new long[n];
      for(int i=0;i<n;i++){
        q.add(sc.nextInt());
      }

      for(int i=1;i<=m;i++){
        int aaa = q.poll()/2;
        q.add(aaa);
      }

      int lng = q.size();

      for(int i=0;i<lng;i++){
        ans += q.poll();
      }


      System.out.println(ans);


    }
}
