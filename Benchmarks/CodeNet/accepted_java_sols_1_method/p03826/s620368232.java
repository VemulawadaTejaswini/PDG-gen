import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int sq1=a*b;
    int sq2=c*d;
    if (sq1 >= sq2){
      System.out.println(sq1);
    } else {
      System.out.println(sq2);
    }
  }
}