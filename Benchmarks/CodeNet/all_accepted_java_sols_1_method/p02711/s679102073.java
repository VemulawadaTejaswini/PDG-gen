import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = N/100;
    int b = (N/10)%10;
    int c = N%10;
  //  System.out.println(N);
  //  System.out.println(a);
  //  System.out.println(b);
  //  System.out.println(c);
    if((a == 7) || (b == 7) || (c == 7)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}