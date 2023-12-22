import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     String S=sc.nextLine();
     char c[] = S.toCharArray();
      for(int i=0;i<c.length;i++){
        if(Character.isUpperCase(c[i])){
          c[i]=Character.toLowerCase(c[i]);
        }else{
          c[i]=Character.toUpperCase(c[i]);
        }
      }
      System.out.print(c);
    System.out.println();
  }
}
