public class Main {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		long n = sc.nextLong();
      	long p = sc.nextLong();
      
      long ans = 0;
      
      for(int i = 0; i < n - 1;i++){
        long q = sc.nextLong();
        ans += (p * q) % 100000007;
        p = (p + q) % 100000007;
      }
      
      System.out.println(ans);
	}
}
