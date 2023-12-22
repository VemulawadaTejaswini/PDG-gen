import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a,b;
    int cnt=0;
    a = sc.next();
    b = sc.next();
    
    for(int i=0;i<3;i++){
      if(a.charAt(i) == b.charAt(i)) cnt++;
    }
    System.out.println(cnt);
    
  }
}