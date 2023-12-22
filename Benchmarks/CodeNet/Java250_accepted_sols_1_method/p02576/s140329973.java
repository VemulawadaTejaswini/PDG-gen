import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();

    int times = n/x;
    if(n % x != 0){
      times++;
    }
    
    System.out.println(times * t);

    return;

  }
}