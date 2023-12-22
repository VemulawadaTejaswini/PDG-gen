import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String p = sc.next();
    String ans = "No";

    for(int i = 0; i < s.length(); i++){
      if(i + p.length() > s.length()){
        if(p.equals(s.substring(i) + s.substring(0, i + p.length() - s.length()))){
          ans = "Yes";
        }
      } else {
        if(p.equals(s.substring(i, i + p.length()))){
          ans = "Yes";
        }
      }
    }

    System.out.println(ans);
  }
}

