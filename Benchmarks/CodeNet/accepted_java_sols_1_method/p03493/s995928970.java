import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    
    String num = sc.next();
    
    for(int i=0; i<num.length(); i++){
      if(num.charAt(i) == '1'){
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}
