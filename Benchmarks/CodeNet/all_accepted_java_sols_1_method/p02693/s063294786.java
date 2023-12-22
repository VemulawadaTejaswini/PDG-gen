import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.next();
    String str3 = scan.next();    
    
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);
    int num3 = Integer.parseInt(str3);    

    int sum = 0;
    String str4 = "";
    
    for(int i=1;i<=1000;i++) {
      sum = num1 * i;
      if(num2 <= sum && num3 >= sum) {
          str4 = "OK";
          break;
      }
      str4 = "NG";
    }
    String str = String.valueOf(num1);
    str = str4;
    System.out.println(str);
    scan.close();    
  }
}