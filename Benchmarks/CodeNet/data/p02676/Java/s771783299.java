import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    int count = s.length();
    String add = "...";
    if(count > 100 || k > 100){
      System.out.println(error);
    }
    
    
    if(count =< k){
      System.out.println(s);
    }else if(count > k){
      String result = s + add;
      System.out.println(result);
    }
  }
}