
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      char[] s = sc.next().toCharArray();
      char ch = s[0];
      boolean flag = false;
      for(int i=1;i<4;i++){
        if(s[i]==ch){
          flag = true;
          break;
        }else{
          ch = s[i];
        }
      }
      if(flag){
        System.out.print("Bad");
      }else{
        System.out.print("Good");
      }
      System.out.flush();
    }
}