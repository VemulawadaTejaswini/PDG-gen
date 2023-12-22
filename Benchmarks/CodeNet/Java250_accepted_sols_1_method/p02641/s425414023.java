import java.util.*;

class Main {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0; i < n; i++)
      p[i] = sc.nextInt();
    
    Arrays.sort(p);
    int diff = 0, flag = 0, res = 0;
    while(flag == 0) {
      if(Arrays.binarySearch(p, x-diff) < 0) {
        res = x - diff;
        flag = 1;
      } else if(Arrays.binarySearch(p, x+diff) < 0) {
        res = x + diff;
        flag = 1;
      }
      diff++;
    }
    System.out.println(res);
  }
}
