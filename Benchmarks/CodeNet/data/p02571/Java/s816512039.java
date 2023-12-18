import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    // System.out.println();
    int count = 0;
    for(int i=t.length() ; i>0 ; i--){
      for(int j=0 ; j<s.length()-i+1 ; j++){
        String ss = s.substring(j,j+i);
        String tt = t.substring(0,i);
        // System.out.println(ss);
        // System.out.println(tt);
        // System.out.println();
        if(ss.equals(tt)){
          count = ss.length();
          break;
        }
      }
    }

    System.out.println(t.length()-count-1);
  }
}
