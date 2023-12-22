import java.util.Scanner;
public class Main{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt(),x;
    if (n%2==0) x=n/2;
    else x=n/2+1;
    System.out.println(x);
    sc.close();
  }
}