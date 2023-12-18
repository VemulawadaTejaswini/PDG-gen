import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    long[] a = new long[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }

    Arrays.sort(a);

    sum += a[n-1];
    int count = 1;
    int many = (int) (n-2)/2;

    for (int i=0;i<many;i++){
      sum += 2*a[n-2-i];
    }

    if (many*2 != n-2){
      sum += a[n-2-many];
    }

    System.out.println(sum);
  }
}
