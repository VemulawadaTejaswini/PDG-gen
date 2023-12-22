import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int cnt = 0;
    if (b == 1) ;
    else if (a >= b) cnt = 1;
    else {
      int x = (b - a) / (a-1);
      if ((b-a)%(a-1) != 0) x++;
      cnt = x +1;
    }
    System.out.println(cnt);
  }
}
