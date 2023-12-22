
import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String n = sc.nextLine();
      char c;
      int count = 0;

      for(int i = 0;i<4;i++){
        c = n.charAt(i);
        if(c=='+'){
          count++;
        }else{
          count--;
        }

      }
        System.out.println(count);

      }

  }
