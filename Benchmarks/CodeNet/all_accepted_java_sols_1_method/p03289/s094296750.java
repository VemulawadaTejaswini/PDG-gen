import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int a = s.indexOf("A");
    int b = s.indexOf("C");
    int c = s.lastIndexOf("C");
    String w = "AC";
    if(a==0){
      if(b==c && b>=2 && b<=(n-2)){
        for(int i=1; i<n; i++){
          if(i!=b){
            int d = s.codePointAt(i);
            if(d>=65 && d<=90){
              w = "WA";
            }
          }
        }
      }
      else{
        w="WA";
      }
    }
    else{
      w = "WA";
    }
    System.out.println(w);
  }
}
