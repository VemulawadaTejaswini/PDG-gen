import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];


    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    Arrays.sort(a);
    int[] b = new int[a[n-1]+1];

    for (int j=0;j<b.length; j++){
      b[j] = 0;
    }

    long sum = 0;

    for (int i=0;i<n;i++){

      int current = a[i];
      for (int j=current;j<=a[n-1];j+=current){
        b[j] += 1;
      }
    }

    for (int i=0;i<n;i++){
      if (b[a[i]] < 2){
        sum += 1;
      }
    }

    System.out.println(sum);

  }

}
