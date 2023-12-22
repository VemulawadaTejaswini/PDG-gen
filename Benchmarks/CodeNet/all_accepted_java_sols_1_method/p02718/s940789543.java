import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum = 0;
    int count = 0;
    int[] a = new int[n];
    for (int i = 0;i<n;i++){
      a[i] = scan.nextInt();
      sum += a[i];
    }
    for (int j=0;j<n;j++){
      if (a[j]*4*m>=sum){
        count += 1;
      }
    }

    if (count<m){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}
