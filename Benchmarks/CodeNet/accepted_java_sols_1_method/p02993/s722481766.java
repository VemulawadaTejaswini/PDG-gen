import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String S = sc.nextLine();
      char c ;
      char[] data = new char[4];
      for(int i = 0; i<4;i++){
        c = S.charAt(i);
        data[i] = c;
      }

      for(int i  = 0;i<3;i++){
        if(data[i]==data[i+1]){
          System.out.println("Bad");
          System.exit(0);
        }
      }
        System.out.println("Good");
                   }
}
