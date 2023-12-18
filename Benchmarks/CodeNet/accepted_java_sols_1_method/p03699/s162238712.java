import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.nextLine());
      sum += n;
      if(n % 10 != 0){
        list.add(n);
      }
    }
    Collections.sort(list);
    
    int ans = 0;
    if(sum % 10 != 0){
      ans = sum;
    }else if(list.size() > 0){
      ans = sum - list.get(0);
    }
    
    System.out.println(ans);
  }
}