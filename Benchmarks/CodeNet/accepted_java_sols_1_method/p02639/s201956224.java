import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a  =sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int ans = 0;
    if(a == 0) ans = 1;
    else if(b == 0) ans = 2;
    else if(c == 0) ans = 3;
    else if(d == 0) ans = 4;
    else ans = 5;
    System.out.println(ans);
    sc.close();
  }
}
