import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    Collections.sort(list);
    int A = list.get(0);
    int B = list.get(1);
    int C = list.get(2);
    
    int a = C-B;
    int b = C-A;
    
    int n = a + b;
    int ans = 0;
    if(n % 2 == 0){
      ans = n / 2;
    }else{
      ans = (n/2)+2;
    }
    System.out.println(ans);
  }
}