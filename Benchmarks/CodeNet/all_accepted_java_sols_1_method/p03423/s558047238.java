import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (n>2) {
      System.out.println(n/3);
    }else{
      System.out.println(0);
    }
  }
}
