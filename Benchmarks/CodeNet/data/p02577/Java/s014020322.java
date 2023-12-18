import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String[] split = S.split("");
    int N = S.length();
    long add = 0;
    for(int i = 0; i < N; i++){
      int a = Integer.valueOf(split[i]);
      add += a;
    }
    if(add % 9 == 0){
      System.out.println("Yes");
    }
	else{
      System.out.println("No");
    }
  }
}
    