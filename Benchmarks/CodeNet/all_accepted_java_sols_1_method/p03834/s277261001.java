import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = str.substring(0,5);
    String str2 = str.substring(6,13);
    String str3 = str.substring(14,19);
    System.out.println(str1+' '+str2+' '+str3);
  }
}