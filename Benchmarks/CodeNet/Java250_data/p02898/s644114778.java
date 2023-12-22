import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int k = scan.nextInt();
    int sum = 0;

    for (int i = 0; i < num; i++){
      int s = scan.nextInt();
      if(s >= k){
        sum+=1;
      }
    }
    System.out.println(sum);
  }
}
