import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    Set<Integer> set = new TreeSet<>();

    for(int i = 1; i <= n; i+=2){
      int tmp = i;
      for(int j = 1; j <= Math.sqrt(tmp); j++){
        if(tmp % j == 0){
          set.add(tmp);
          set.add(j);
          set.add(tmp / j);
        }
      }
      if(set.size() == 8){
        cnt++;
      }
      set.clear();
    }

    System.out.println(cnt);

  }
}
