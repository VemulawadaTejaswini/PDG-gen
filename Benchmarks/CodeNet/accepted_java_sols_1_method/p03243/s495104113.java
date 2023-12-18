import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    int ans = 0;
    if(N <= 111){
      ans = 111;
    }else if(N <= 222){
      ans = 222;
    }else if(N <= 333){
      ans = 333;
    }else if(N <= 444){
      ans = 444;
    }else if(N <= 555){
      ans = 555;
    }else if(N <= 666){
      ans = 666;
    }else if(N <= 777){
      ans = 777;
    }else if(N <= 888){
      ans = 888;
    }else if(N <= 999){
      ans = 999;
    }
    
    System.out.println(ans);
  }
}