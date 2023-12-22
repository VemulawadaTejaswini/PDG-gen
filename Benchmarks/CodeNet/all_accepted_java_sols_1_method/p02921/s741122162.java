import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    int n = 0;

    if(s.substring(0,1).equals(t.substring(0,1))){
      n++;
    }
    if(s.substring(1,2).equals(t.substring(1,2))){
      n++;
    }
    if(s.substring(2,3).equals(t.substring(2,3))){
      n++;
    }
    System.out.println(n);
  }
}
