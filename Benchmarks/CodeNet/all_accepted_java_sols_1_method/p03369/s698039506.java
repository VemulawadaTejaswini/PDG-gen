import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String[] top = sc.next().split("");
    int count = 0;
    
    for(int i = 0 ; i < top.length ; i++){
      if(top[i].equals("o")){
        count++;
      }
    }
    System.out.println(700 + (count * 100));
  }
}
