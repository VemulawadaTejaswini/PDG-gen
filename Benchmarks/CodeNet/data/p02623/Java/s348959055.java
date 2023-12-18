import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int k = sc.nextInt();
      
      List<Integer> a = new ArrayList<>();
      List<Integer> b = new ArrayList<>();
      
      for(int i = 0; i < n; i++){
        a.add(sc.nextInt());
      }
      
      for(int i = 0; i < m; i++){
        b.add(sc.nextInt());
      }
      
      a.addAll(b);
      
      Collections.sort(a);
      
      int result = 0;
      for(int i = 0; i < n+m; i++){
      	k -= a.get(i);
        if(k < 0){
          break;
        }
        result++;
      }
      
      System.out.print(result);
    }
}
