import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int k = s.nextInt();
    int x = s.nextInt();
    int a=x-k+1,b=x+k;
    for(int i=a;i<b;i++)
      System.out.print(i+" ");
  }
}