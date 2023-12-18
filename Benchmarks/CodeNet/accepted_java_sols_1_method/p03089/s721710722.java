import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      List<Integer> nums = new ArrayList<>();
      nums.add(0);
      for(int i = 1; i <=n; i++)
        nums.add(sc.nextInt());

      List<Integer> result = new ArrayList<>();
      while(nums.size() > 1) {
        int idx = -1;
        for(int i = 1; i < nums.size(); i++) {
          if(nums.get(i) > i) {
            System.out.println(-1);
            return;
          }
          if(nums.get(i) == i)
            idx = i;
        }
        
        result.add(nums.get(idx));
        nums.remove(idx);
      }
      for(int i = result.size() - 1; i >= 0; i--)
        System.out.println(result.get(i));
  }
}