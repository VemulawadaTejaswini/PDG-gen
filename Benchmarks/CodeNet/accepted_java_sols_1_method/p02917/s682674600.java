import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n-1];
    int total = 0;
    for(int i=0 ; i<n-1 ; i++){
      b[i] = sc.nextInt();
    }

    a[0] = b[0];

    for(int i=0 ; i<n-1 ; i++){
      if(a[i]>b[i]){
        a[i] = b[i];
      }
      a[i+1] = b[i];
    }
    for(int i=0 ; i<n ; i++){
      // System.out.println(a[i]);
      total = total + a[i];
    }
    System.out.println(total);
  }
}
