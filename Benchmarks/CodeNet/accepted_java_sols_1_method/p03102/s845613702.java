import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    int sum =0;
    int count = 0;
    for(int i=0;i<m;i++){
      b[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
      sum = 0;
      for(int k=0;k<m;k++){
        a[k] = sc.nextInt();
        sum += a[k]*b[k];
      }
      if(sum + c > 0){
        count++;
      }
    }
    System.out.println(count);
  }
}
      