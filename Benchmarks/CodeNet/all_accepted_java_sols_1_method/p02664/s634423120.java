import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    String t = sc.next();

    for(int i = 0; i < t.length(); i++){
      if(t.charAt(i) == 'P' || t.charAt(i) == 'D'){
        sb.append(t.substring(i, i + 1));
      } else {
        sb.append("D");
      }
    }

    System.out.println(sb);
  }
}
