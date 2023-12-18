import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      //nテ」ツ?ョ8テゥツ?イテヲツ閉ーティツ。ツィティツィツ?
      String octal = Integer.toString(n, 8);

      octal = octal.replaceAll("7", "9");
      octal = octal.replaceAll("6", "8");
      octal = octal.replaceAll("5", "7");
      octal = octal.replaceAll("4", "5");
      System.out.println(octal);
    }
  }
}