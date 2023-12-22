import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    if(s.length%2==1){
      System.out.println("No");
      return;
    }else{
      Arrays.sort(s);
      char x = s[0];
      int count = 0;
      for(int i=0;i<s.length;i++){
        if(x==s[i]){
          count++;
        }else{
          if(count%2==1){
            System.out.println("No");
            return;
          }
          count = 1;
          x = s[i];
        }
      }
      System.out.println("Yes");
    }
  }
}