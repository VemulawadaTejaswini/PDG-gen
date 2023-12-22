import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int abc, a, b, c;
    Scanner sc = new Scanner(System.in);
    abc = sc.nextInt();
    a = abc / 100;
    b = (abc - (a*100)) / 10;
    c = abc - ((a * 100) + (b * 10));
    System.out.println(a + b + c);
    
  }
}