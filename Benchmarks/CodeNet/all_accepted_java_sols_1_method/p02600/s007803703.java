import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int ans = 0;
    if(X >= 400 && X < 600) ans = 8;
    else if(X >= 600 && X < 800) ans = 7;
    else if(X >= 800 && X < 1000) ans = 6;
    else if(X >= 1000 && X < 1200) ans = 5;
    else if(X >= 1200 && X < 1400) ans = 4;
    else if(X >= 1400 && X < 1600) ans = 3;
    else if(X >= 1600 && X < 1800) ans = 2;
    else  ans = 1;

    System.out.println(ans);
    sc.close();
  }
}