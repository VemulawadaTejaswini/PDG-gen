import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    if (a%2==1){
      System.out.println(((a/2)+1)*(a/2));
    } else {
      System.out.println((a/2)*(a/2));
    }
  }
}
