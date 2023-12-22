import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    List<String> list = new ArrayList<>();
    for(int i = 0;i < H; i++){
      list.add(sc.next());
    }
    for(int j = 0; j < H; j++){
      String ans = list.get(j);
      System.out.println(ans);
      System.out.println(ans);
    }
  }
}
