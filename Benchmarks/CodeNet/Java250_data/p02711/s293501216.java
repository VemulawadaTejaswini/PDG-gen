import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean flag = false;
    for(int i=0;i<S.length();i++) {
      if(S.substring(i,i+1).equals("7")) flag = true;
    }
    
    if(flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}