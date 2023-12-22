import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }
      int[] a = new int[n];
      for(int i=0; i<n; i++) {
        a[i] = sc.nextInt();
      }
      int max_sum = -10000000;
      for(int i=-1; i<n; i++) {
	int sum=0;
        for(int j=i+1; j<n; j++) {
          sum += a[j];
	  if(max_sum < sum) {
            max_sum = sum;
	  } 
	}
      }
      System.out.println(max_sum);
    }
  }
}