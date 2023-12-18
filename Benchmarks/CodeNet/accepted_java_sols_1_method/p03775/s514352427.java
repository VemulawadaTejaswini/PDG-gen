import  java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = Integer.MAX_VALUE;
		for(long i = 1; i * i <= N; i++) {
			if(N % i == 0) {
				ans = Math.min(ans, Math.max(Long.toString(i).length(), Long.toString(N / i).length()));
			}
		}
		System.out.println(ans);
	}
}