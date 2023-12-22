import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //S
    String s = sc.next();
    String ans = "Yes";
    
    int sL = s.length();

    if (sL%2 == 0){
      if(sL==2 && (!(s.equals("hi")))){
            ans = "No";
      } else {
        for(int i = 0; i<sL-2; i++){
          String s1 = s.substring(i, i+2);
          if (!(s1.equals("hi"))){
            ans = "No";
            break;
          }
          i++;
        }
      }
     } else {
        ans = "No";
     }
    
    System.out.println(ans);
  }
}