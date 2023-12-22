import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String ans = "";
    for(int i=0; i<3; i++){
      ans += s.charAt(i);
    }
    System.out.println(ans);

    sc.close();
  }
}