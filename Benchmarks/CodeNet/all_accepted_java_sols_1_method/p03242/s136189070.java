import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String S = sc.nextLine();
      char[]  n = new char[3];
      for(int i =0;i<3;i++){
          n[i]=S.charAt(i);
        }

      for(int i =0;i<3;i++){
        if(n[i]=='1'){
          n[i]='9';
        }else{
          n[i]='1';
        }

      }
      System.out.print(n);
  }
}