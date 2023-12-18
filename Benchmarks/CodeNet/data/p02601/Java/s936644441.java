import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int k = scan.nextInt();

    int count = 0;
    while (a >= b){
      b*=2;
      count += 1;
    }

    while (b>=c){
      c*=2;
      count+=1;
    }

    if (count <= k){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

  }
}
