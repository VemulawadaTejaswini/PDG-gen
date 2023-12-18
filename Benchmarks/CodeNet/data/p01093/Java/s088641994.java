import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    while(true){
      int n = s.nextInt();
      
      if(n==0){
        break;
      }

      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = s.nextInt();
      }

      int ans = 1000000;
      Arrays.sort(a);

      for(int i=0;i<n-1;i++){
        int m = a[i+1] - a[i];
        if(ans > m){
          ans = m;
        }
      }

      System.out.println(ans);
    }

  }
}
