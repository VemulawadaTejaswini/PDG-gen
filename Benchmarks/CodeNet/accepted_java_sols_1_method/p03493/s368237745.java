import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    String[] m = s.split("");
    int cnt = 0;
    if ("1".equals(m[0])) cnt++;
    if ("1".equals(m[1])) cnt++;
    if ("1".equals(m[2])) cnt++;
    System.out.println(cnt);
  }
}