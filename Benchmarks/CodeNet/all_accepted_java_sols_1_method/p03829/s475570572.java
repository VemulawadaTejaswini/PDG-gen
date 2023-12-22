import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    long[] c = new long[n];

    int pre = scan.nextInt();

    for (int i=0;i<n-1;i++){
      int x = scan.nextInt();
      long dis = (long) (x-pre)*a;
      pre = x;
      if (dis > b){
        dis = b;
      }
      c[i] = dis;
    }

    long sum = 0;
    for (int i=0;i<n;i++){
      sum += c[i];
    }

    System.out.println(sum);

  }

}
