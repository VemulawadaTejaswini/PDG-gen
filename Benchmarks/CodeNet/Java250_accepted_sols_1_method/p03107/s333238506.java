import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int aka = 0;
    int ao = 0;
    
    for(int i = 0 ; i < n ; ++i){
      if(s.charAt(i)=='0'){
        aka++;
      }else{
        ao++;
      }
    }
    
    int ju = Math.min(aka,ao);
    System.out.println(ju*2);
    
  }
}
