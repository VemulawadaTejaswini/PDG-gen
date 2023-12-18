import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int [n];
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for(int j = a[0];j <= a[n - 1];j++){
      sum = 0;
      for(int i = 0;i < n;i++){
        sum += (j - a[i]) * (j - a[i]);
      }
      if(min > sum){
        min = sum;
      }
    }
    System.out.println(min);
  }
}