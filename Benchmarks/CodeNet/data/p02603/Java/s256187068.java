import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    int initial = 1000;

    for (int i=0;i<n-1;i++){
      if (a[i+1] > a[i]){
        int item = (int) initial/a[i];
        initial += item*(a[i+1]-a[i]);
      }
    }
    System.out.println(initial);
  }

}
