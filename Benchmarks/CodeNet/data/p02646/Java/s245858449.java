import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int v = sc.nextInt();
      int b = sc.nextInt();
      int w = sc.nextInt();
      int t = sc.nextInt();
      long aPos = (long)a + v * t;
      long bPos = (long)b + w * t;
      if(bPos <= aPos){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
}