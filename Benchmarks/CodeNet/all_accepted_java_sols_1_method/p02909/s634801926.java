import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = s.charAt(0);
    if(c=='S') s = "Cloudy";
    if(c=='C') s = "Rainy";
    if(c=='R') s = "Sunny";
    System.out.println(s);
  }
}