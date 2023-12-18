import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for (int i=1;i<=n;i++) {
      String ans=String.valueOf(i);
      if (ans.length()%2!=0) {
        count++;
      }
    }

    System.out.println(count);
  }
}
