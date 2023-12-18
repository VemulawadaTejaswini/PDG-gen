import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String S =sc.nextLine();

      char c;
      char[] data  = new char[S.length()];
      int count  = 0;

      for(int i = 0;i<S.length();i++){
        c = S.charAt(i);
        data[i] = c;
      }
      for(int i =0;i<4;i++){
        for(int j = i+1;j<4;j++){
          if(data[i]==data[j]){
            count++;
          }
        }
      }
      if(count==2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }


  }
}