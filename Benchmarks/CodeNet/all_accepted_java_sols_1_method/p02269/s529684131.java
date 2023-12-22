import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    Set<String> hs = new HashSet<>();
    for(int i = 0; i < x; i++){
      String s = sc.next();
      String a = sc.next();
      if(s.equals("insert")){
        hs.add(a);
      }
      else if(s.equals("find")){
        if(hs.contains(a)){
          System.out.printf("yes\n");
        }
        else{
          System.out.printf("no\n");
        }
      }
    }
  }
}
