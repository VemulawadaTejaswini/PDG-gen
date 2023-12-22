import java.util.*;
  public class Main {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] arr = new ArrayList[m+1];
        
        for(int i = 1; i <= m; i++)
            arr[i] = new ArrayList<>();

        for(int i = 0; i < n; i++) {
          int day = sc.nextInt();
          int b = sc.nextInt();
          if(day > m) continue;
          arr[day].add(b);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long cnt = 0L;
        for(int i = 1; i <= m; i++) {
          for(int b : arr[i])
            pq.offer(b);
          cnt += pq.size() == 0 ? 0 : pq.poll();
        }
        System.out.println(cnt);
    }
  }  