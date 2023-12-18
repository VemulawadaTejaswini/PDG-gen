import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();

    long sum = 1;
    long [] c = new long[a];
    for (int i=0;i<a;i++){
      long b = scan.nextLong();
      if (b==0){
        System.out.println(0);
        return;
      }
      c[i] = b;
    }

    for (int j=0;j<a;j++){
      sum*=c[j];
      if (Math.log10(sum)>18){
        System.out.println("-1");
        return;
      }
    }
    System.out.println(sum);
  }
}
