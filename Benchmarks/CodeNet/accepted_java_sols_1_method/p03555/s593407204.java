import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int ans = 0;
    for(int i = 0;i < 3;i++){
      if(!(a.substring(i,i+1).equals(b.substring(2-i,3-i)))){
        ans = 1;
      }
    }
    if(ans == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
