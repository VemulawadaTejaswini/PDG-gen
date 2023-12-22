import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n+1];
    int c[] = new int[n*(n+1)/2];
    int min = 100;
    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<n+1 ; i++){
      if(i==0){
        b[i] = 0;
      }else{
        b[i] = a[i-1] + b[i-1];
      }
    }
    // for (int i = 0; i < n+1; i++) {
    //   System.out.println(b[i]);
    // }
    for(int i=0 ; i<n ; i++){
      c[i] = b[n]-b[i];
      int x = Math.abs(c[i]-b[i]);
      min = Math.min(min,x);
    }
    // Arrays.sort(c);
    System.out.println(min);
  }
}
