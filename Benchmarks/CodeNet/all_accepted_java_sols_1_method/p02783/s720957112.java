import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    int ans = 0;
    for(int i = 1;;i++){
      ans += a;
      if(ans >= h) {
        System.out.println(i);
        break;
      }
    }
  }
}