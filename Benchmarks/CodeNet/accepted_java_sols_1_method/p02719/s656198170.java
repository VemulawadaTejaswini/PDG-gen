import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

		long a = n%k;
		long ans = 0;
		if( n%k==0 ){
			ans = 0;
		}else{
			ans = Math.min(a, k-a);
		}
		System.out.println(ans);
    }
}