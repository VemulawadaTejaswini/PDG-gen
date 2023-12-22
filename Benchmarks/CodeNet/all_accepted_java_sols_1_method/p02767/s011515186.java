import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	int[] x = new int[n];
	int sum = 0;
	int ans = Integer.MAX_VALUE;

	for(int i=0;i<n;i++) {
		x[i] = sc.nextInt();
	}

	for(int i=1;i<=100;i++) {
		for(int j=0;j<n;j++) {
			sum += (x[j]-i)*(x[j]-i);
		}
	ans = Math.min(sum, ans);
	sum = 0;
	}
	System.out.println(ans);
  }
}