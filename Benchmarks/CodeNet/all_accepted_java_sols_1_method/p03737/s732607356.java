import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String str3 = sc.next();
    String str4 = str1.toUpperCase();
    String str5 = str2.toUpperCase();
    String str6 = str3.toUpperCase();
    char str7 = str4.charAt(0);
    char str8 = str5.charAt(0);
    char str9 = str6.charAt(0);
    System.out.println(str7+""+str8+""+str9);
  }
}