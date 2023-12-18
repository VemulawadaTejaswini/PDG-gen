import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String c[] = new String[3];
    for(int i = 0;i < 3;i++){
      c[i] = sc.next();
    }
    String ans = c[0].substring(0,1) + c[1].substring(1,2) + c[2].substring(2,3);
    System.out.println(ans);
  }
}
