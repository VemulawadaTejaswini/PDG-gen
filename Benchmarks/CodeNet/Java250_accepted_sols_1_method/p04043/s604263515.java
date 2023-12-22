import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if (a==b){
      if (a==5 && c==7){
        System.out.println("YES");
        System.exit(0);
      }
    } else if (a==c) {
      if (a==5 && b==7){
        System.out.println("YES");
        System.exit(0);
      }
    } else if (b==c) {
      if (b==5 && a==7){
        System.out.println("YES");
        System.exit(0);
      }
    }
    System.out.println("NO");
  }
}
