import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
	int a = 0;
    for (int i=0; i<=3; i++){
      if (s.substring(i,i+1).equals("+")) {
        a++;
      } else {
        a--;
      }
    }
    System.out.println(a);
  }
}