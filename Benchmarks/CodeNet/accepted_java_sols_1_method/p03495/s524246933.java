import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    int numbers = 0;
    int[] count = new int[200001];
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      a[i] = num;
      count[num]++;
      set.add(num);
    }
    Arrays.sort(count);
    int ans = 0;
    int index = 0;
    int size = set.size();
    while(count[index] == 0) index++;
    while(size > k) {
      ans += count[index];
      index++;
      size--;
    }
    System.out.println(ans);
  }
}
