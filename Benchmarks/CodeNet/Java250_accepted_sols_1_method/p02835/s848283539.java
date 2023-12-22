import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    int total=0;
    for (int i=0;i<3;i++) {
      a[i]=sc.nextInt();
      total+=a[i];
    }
    if (total>21) {
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}
