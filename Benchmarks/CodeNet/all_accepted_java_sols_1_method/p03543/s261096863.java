import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = a/10;
    int c = a-(a/1000)*1000;
    if (b%111==0 || c%111==0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}