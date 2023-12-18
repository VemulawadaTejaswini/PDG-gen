import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String str = "";
    if(a==b&&b==c&&a==c)str = "Yes";
    else str = "No";
    System.out.println(str);
  }
}