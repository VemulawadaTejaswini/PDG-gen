import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    Arrays.sort(a);

    int l = 1;
    int r = a[n-1];
    long s = 0;

    while (r > l){
      int mid = (int) (l+r)/2;
      s = find(a,mid);
      if (s > k){
        l = mid + 1;
      }
      else{
        r = mid;
      }
    }

    System.out.println(l);
  }

  static long find(int[] a, int target){
    long sum = 0;
    for (int b : a){
      int g = (int) b/target;
      if (target*g != b){
        g += 1;
      }
      g -= 1;
      sum += g;
    }
    return sum;
  }

}
