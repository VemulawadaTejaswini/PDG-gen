import java.util.Scanner;

public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // 文字列の入力1
      String str1 = sc.nextLine();
      // 文字列の入力1
      String str2 = sc.nextLine();
      if(!str1.equals(str2)) {
        int count = 0;
        for(int i = 0;i<str1.length();i++) {
          if(str1.charAt(i)!= str2.charAt(i)) {
            count++;
          }
        }
        System.out.println(count);
      }else {
        System.out.println(0);
      }
  }
}