import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    String r = s.replaceAll("^(.{"+k+"}).+$","$1...");
    System.out.println(r);
  }
}