import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    String ans = "A";
    if (c.equals("A")){ans = "T";}
    if (c.equals("T")){ans = "A";}
    if (c.equals("C")){ans = "G";}
    if (c.equals("G")){ans = "C";}
    System.out.println(ans);
  }
}