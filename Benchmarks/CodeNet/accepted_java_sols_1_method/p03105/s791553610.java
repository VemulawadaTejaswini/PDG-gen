import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int cnt = 0;
    while(true){
      b -= a;
      if(cnt >= c) break;
      if( b < 0) break;
      cnt++;
    }
    System.out.println(cnt);
  }
}