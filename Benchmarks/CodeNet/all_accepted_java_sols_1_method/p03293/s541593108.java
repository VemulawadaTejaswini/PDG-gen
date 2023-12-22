import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();
    
    String l = "";
    String r = "";
    
    int n = s.length();
    
    String ans ="";
    
    if(s.equals(t)){
      ans = "Yes";
    }else{
    for(int i = n-1 ; i > 0 ; --i){
      r = s.substring(i);
      l = s.substring(0,i);
      if((r+l).equals(t)){
        ans = "Yes";
        break;
      }else{
        ans = "No";
      }
    }
    }
    
    System.out.println(ans);
    
  }
}

