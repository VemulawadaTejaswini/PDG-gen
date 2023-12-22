import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main();
    main.solve();
  }
  
  private void solve(){
    
    Scanner scanner = new Scanner (System.in);
    
    String S = scanner.nextLine();
    StringBuffer sb = new StringBuffer(S);
    int count = 0;
    
    for (int index=0; index<sb.length();index++){
      if (sb.charAt(index)=='1'){
        count++;
      } else {
        count--;
      }
    }
    
    System.out.println((sb.length()-(Math.abs(count))));
  }
}