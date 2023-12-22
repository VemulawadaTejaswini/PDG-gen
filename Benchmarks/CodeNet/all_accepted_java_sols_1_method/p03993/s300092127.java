import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f = 0;
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(a[a[i]-1]==i+1){
        f++;
        //System.out.println(a[a[i]-1]);
      }
    }
    System.out.println(f/2);
  }
}
