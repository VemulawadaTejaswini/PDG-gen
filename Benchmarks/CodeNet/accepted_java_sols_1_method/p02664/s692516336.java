import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String t = sc.next();
    t = t.replace("P?","PD");
    t = t.replace("?D","PD");
    t = t.replace("??","PD");
    t = t.replace("?","D");
    System.out.println(t);
  }
}