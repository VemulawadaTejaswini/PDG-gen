import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(long i = 0 ; i < 10000000 ; i++) {
			count++;
			sum += pow(10 , i , n) * 7;
			sum += n;
            sum %= n;
			if(sum == 0) {
				System.out.println(count);
				return;
			}

		}
		System.out.println(-1);

	}
	public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;  //2進数によるべき乗の高速計算
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}

