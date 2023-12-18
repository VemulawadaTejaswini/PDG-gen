import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    //System.out.println();
    int count = 0;
    loop: for(int i=t.length() ; i>0 ; i--){
      for(int j=0 ; j<s.length()-i+1 ; j++){
        for(int k=0 ; k<t.length()-i ; k++){
          String ss = s.substring(j,j+i);
          String tt = t.substring(k,i+k);
          // System.out.println(tt);
          // System.out.println(ss);
          // System.out.println();
          if(ss.equals(tt)){
            if(k<=j){
              count = ss.length();
              //System.out.println(k);
              break loop;
            }
          }
        }
      }
    }

    System.out.println(t.length()-count);
  }
}
