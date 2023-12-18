import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    int count = s.length();
    String add = "...";
    
    if(count <= k){
      System.out.println(s);
    }else if(count > k){
      String result = s.substring(0, k) + add;
      System.out.println(result);
    }
  }
}