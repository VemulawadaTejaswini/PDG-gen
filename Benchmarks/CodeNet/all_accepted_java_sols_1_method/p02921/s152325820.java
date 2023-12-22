import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int count = 0;
    String s,t;

    s = sc.next();
    t = sc.next();

    for(int i = 0; i < 3; i++){
      if(s.charAt(i) == t.charAt(i)){
        count++;
      }
    }

    System.out.println(count);
  }
}
