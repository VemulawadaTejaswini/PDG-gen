import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
    int m = sc.nextInt();

    if(n-m!=1&&n-m!=-1&&n-m!=0){
      System.out.print("0");
      return;
    }

    long ans = 1;
    for(int i=2; i<=n; i++){
      ans *= (long)i;
      ans = ans % 1000000007;
    }
    for(int i=2; i<=m; i++){
      ans *= (long)i;
      ans = ans % 1000000007;
    }
    if(n==m){
      ans *= 2;
      ans = ans % 1000000007;
    }
    System.out.print(ans);

	}

}
