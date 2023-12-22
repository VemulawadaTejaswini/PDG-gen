import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int d = sc.nextInt();
    c = c-1;
    d = d-1;
    c = (c*(c+1))/2;
    d = (d*(d+1))/2;
    c = c+d;
    System.out.println(c);
  }
}