import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    StringBuffer a = new StringBuffer(N);
    String b = a.reverse().toString();
    if(N.equals(b)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}