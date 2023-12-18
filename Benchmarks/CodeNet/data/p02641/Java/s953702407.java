import java.util.*;

class Main {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    
    for(int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      set.add(temp);
    }
    
    int diff = 1, flag = 0, res = 0;
    while(flag == 0) {
      if(!set.contains(x-diff)) {
        res = x - diff;
        flag = 1;
      } else if(!set.contains(x + diff)) {
        res = x + diff;
      }
    }
    System.out.println(res);
  }
}