import java.util.Scanner;

public class Main{
  static public void main(String args[]){
    int S = 0;
    int h,m,s = 0;

    Scanner sc = new Scanner(System.in);
    S = sc.nextInt();

    h = S/3600;
    m = (S%3600)/60;
    s = (S%3600)%60;
    System.out.println(h+":"+m+":"+s);
  }
}