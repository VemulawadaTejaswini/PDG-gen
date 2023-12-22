import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int l[]=new int[n];
    for (int i=0;i<n;i++) {
      l[i]=sc.nextInt();
    }

    int d[]=new int[n+2];
    d[1]=0;

    int count=1;

    for (int i=0;i<n;i++) {
      d[i+1]=d[i]+l[i];
      if (d[i+1]<=x) {
        count++;
      }
    }


    System.out.println(count);
  }
}
