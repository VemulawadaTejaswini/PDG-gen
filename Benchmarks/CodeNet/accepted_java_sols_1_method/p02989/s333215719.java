import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    
    for(int i=0;i<n;i++){
      int b = sc.nextInt();
      a.add(b);
    }
    Collections.sort(a);
    
    int ans = a.get(n/2) - a.get((n/2)-1);
    System.out.println(ans);
  }
}