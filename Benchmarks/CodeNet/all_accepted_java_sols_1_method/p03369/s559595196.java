import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t[] = s.split("");
    int ans = 0;
    for (int i = 0; i < 3; i++){
      if (t[i].equals("o")) ans += 100;
    }
    System.out.println(ans + 700);
  }
}