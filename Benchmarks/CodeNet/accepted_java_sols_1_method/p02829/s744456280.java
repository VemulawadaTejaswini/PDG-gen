import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = "123";
    String a = sc.next();
    String b = sc.next();
    String str1 = str.replace(a,"").replace(b,"");
    System.out.println(str1);
  }
}