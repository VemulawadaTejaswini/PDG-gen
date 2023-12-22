import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int total=0;
    for (int i=0;i<3;i++) {
      int a=sc.nextInt();
      total=total+a;
    }

    if (total>=22) {
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}
