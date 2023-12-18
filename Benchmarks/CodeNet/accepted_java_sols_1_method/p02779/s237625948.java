import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> a = new ArrayList<>();
    while (sc.hasNext()){
      a.add(sc.nextInt());
    }
    
    boolean ans = (a.size() == new HashSet<>(a).size());
    
    if(ans){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

    
    
  }
}