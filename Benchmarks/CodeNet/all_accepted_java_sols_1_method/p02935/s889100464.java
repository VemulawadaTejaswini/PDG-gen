import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    double d = (double)(a[0]+a[1])/2;
    for(int i = 2;i<n;i++){
      d = (d + a[i])/2;
    }
    System.out.println(d);      
  } 
}