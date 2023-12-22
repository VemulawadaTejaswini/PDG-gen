import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int ans = 0;
    int max = 0;

    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == 'R'){
        ans ++;
      }else{
        max = Math.max(ans,max);
        ans = 0;
      }
    }
    
    System.out.println(Math.max(ans,max));
   
    scanner.close();
    return;
  }
  
}
