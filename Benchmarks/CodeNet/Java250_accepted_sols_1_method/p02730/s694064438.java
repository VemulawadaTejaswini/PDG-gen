import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    boolean b = true;
    for(int i=0 ; i<n/2 ; i++){
      if(s.charAt(i)!=s.charAt(n-1-i)){
        b = false;
        break;
      }else{
        continue;
      }
    }
    if(b){
      for(int i=0 ; i<((n-1)/2)-1 ; i++){
        if(s.charAt(i)!=s.charAt(((n-1)/2)-1-i)){
          b = false;
          break;
        }else{
          continue;
        }
      }
    }
    if(b){
      for(int i=((n+3)/2)-1 ; i<(3*n+3)/4 ; i++){
        if(s.charAt(i)!=s.charAt(n-1+(n+3)/2-1-i)){
          b = false;
          break;
        }else{
          continue;
        }
      }
    }
    if(b){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
