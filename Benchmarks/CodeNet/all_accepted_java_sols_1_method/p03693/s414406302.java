import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int num = 100*r+10*g+b;
    if (num%4==0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}