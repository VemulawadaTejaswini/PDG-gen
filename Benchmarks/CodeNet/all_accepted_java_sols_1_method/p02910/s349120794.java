import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    boolean t = true;
    for(int i=0;i<s.length();i++){
      if (i%2 == 0 && c[i] == 'L'){
        t = false;
        break;
      } else if (i%2 == 1 && c[i] == 'R'){
        t = false;
        break;
      }
    }
    if(t == true){
      System.out.println("Yes");
    } else if (t == false){
      System.out.println("No");
    }
  }
}