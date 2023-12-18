import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    for(int i = 1;i<n;i++){
      s += sc.next();
    }
    int bf = s.length();
    s = s.replace("Y","");
    if(s.length() == bf){
      System.out.println("Three");
    }else{
      System.out.println("Four");
    }
  }
}
