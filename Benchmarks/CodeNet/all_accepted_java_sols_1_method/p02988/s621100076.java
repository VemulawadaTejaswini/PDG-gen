import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt =0;
      int N = sc.nextInt();
      int[] a = new int[N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextInt();
      }
      
      for(int i=1 ; i<N-1; i++) {
    	  if (a[i-1] < a[i] && a[i]< a[i+1]) {
    		  cnt++;
    	  }
    	  if (a[i-1] > a[i] && a[i]> a[i+1]) {
    		  cnt++;
    	  }
      }
      System.out.println(cnt);
  }
}