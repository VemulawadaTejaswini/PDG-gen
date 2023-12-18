import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String a = sc.nextLine();
      char c;
      int sum = 700;

      for(int i = 0;i<3;i++){
        c = a.charAt(i);
        if(c=='o'){
          sum = sum + 100;
        }
      }

        System.out.println(sum);

  }
}
