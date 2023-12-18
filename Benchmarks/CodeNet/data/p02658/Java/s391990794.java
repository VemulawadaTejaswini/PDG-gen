import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long a[] = new long[n];
    long ans =1;

    for(int i=0;i<n;i++) {
    	a[i] = sc.nextLong();
    }
    for(int i=0;i<n;i++) {
    	ans *=a[i];
    }
    if(ans>=Math.pow(10, 18)) {
    	System.out.println(-1);
    }
    else {
    	System.out.println(ans);
    }
  }
}