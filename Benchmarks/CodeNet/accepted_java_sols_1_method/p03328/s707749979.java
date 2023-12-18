import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int N = b - a ;

    System.out.println( N * ( N  + 1 ) / 2 - b  );
  }
}
