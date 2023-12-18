import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int count = 0;
    while (n>0){
      n -= m;
      count++;
    }

    System.out.println(count);
  }
}
