import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    // System.out.println(s.length());
    if(k<s.length()){
      for(int i=0 ; i<k ; i++){
        System.out.print(s.charAt(i));
      }
      System.out.println("...");
    }else{
      System.out.println(s);
    }
  }
}
