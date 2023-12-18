import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();

    long ans = t*s;

    if(d <= ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

    
    return;

  }
}

