import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int num = (n-1)/111 + 1;
    System.out.println(num*111);
  }
}
