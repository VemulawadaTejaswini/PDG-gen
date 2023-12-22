import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int k = sc.nextInt();
      long[] A = new long[x];
      long[] B = new long[y];
      long[] C = new long[z];
      for(int i = 0; i < x; i++) A[i] = sc.nextLong();
      for(int i = 0; i < y; i++) B[i] = sc.nextLong();
      for(int i = 0; i < z; i++) C[i] = sc.nextLong();
      Arrays.sort(A);
      Arrays.sort(B);
      Arrays.sort(C);

      PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (int)((A[b[0]] + B[b[1]] + C[b[2]]) - (A[a[0]] + B[a[1]] + C[a[2]])));
      pq.offer(new int[]{x-1, y-1, z-1});
      Set<String> visited = new HashSet<>();
      visited.add((x-1) + "," + (y-1) + "," + (z-1));
      for(int i = 0; i < k; i++) {
        int[] ele = pq.poll();
        System.out.println(A[ele[0]] + B[ele[1]] + C[ele[2]]);
        for(int j = 0; j < 3; j++) {
          if(ele[j] == 0) continue;
          int[] newEle = ele.clone();
          newEle[j]--;
          String key = newEle[0] + "," + newEle[1] + "," + newEle[2];
          if(visited.contains(key)) continue;
          visited.add(key);
          pq.offer(newEle);
        }
      }
  }
}