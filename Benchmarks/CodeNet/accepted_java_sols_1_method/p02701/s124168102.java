import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    Set<String> b = new HashSet<String>();
    for (int i=0;i<a;i++){
      String t = scan.next();
      b.add(t);
    }
    System.out.println(b.size());
  }

}
