import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int cnt = 0;
    char[] c = s.toCharArray();
    if(c[0] == 'R' && c[1] == 'R' && c[2] == 'R') {
      cnt = 3;
    } else if(c[0] == 'R' && c[1] == 'R') {
      cnt = 2;
    } else if(c[1] == 'R' && c[2] == 'R') {
      cnt = 2;
    } else if(c[0] == 'R' || c[1] == 'R' || c[2] == 'R') {
      cnt = 1;
    }
    System.out.println(cnt);
  }
}