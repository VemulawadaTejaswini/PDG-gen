import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    List<Integer> list = new ArrayList();
    int n = s.nextInt();
    int m = s.nextInt();
    int sum = 0;
    boolean coosable = true;
    for(int i = 0; i < n; i++){
      int value = s.nextInt();
      list.add(value);
      sum = sum + value;
    }
    Collections.sort(list);
    Collections.reverse(list);
    for(int i = 0; i < m; i++){
      if(list.get(i) < Math.ceil((double)sum / (4 * m))){
        coosable = false;
      }
    }
    if(coosable){
      System.out.println("Yes");
    } else{
      System.out.println("No");
    }
  }
}