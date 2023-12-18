import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0;i<n;i++)a[i] = Integer.parseInt(sc.next());
    long res = 0;
    long val;
    for(int i=0;i<n-1;i++){
      val = a[i]/2;
      a[i]-=2*val;
      res+=val;
      if(a[i]>0 && a[i+1] > 0){
        res++;
        a[i+1]--;
      }
    }
    val = a[n-1]/2;
    System.out.println(res+val);
  }
}