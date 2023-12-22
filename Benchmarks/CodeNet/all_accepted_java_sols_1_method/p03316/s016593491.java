import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;

    for(int i=0; i<s.length(); i++){
      ans += Integer.parseInt(s.substring(i, i+1));
    }
    int num = Integer.parseInt(s);
    if(num%ans==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}