import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    if(Character.isUpperCase(a.charAt(0))) System.out.printf("A");
    else System.out.printf("a");
  }
}