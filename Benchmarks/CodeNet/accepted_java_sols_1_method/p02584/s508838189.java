import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long res;
        long tika = Math.abs(X)/D;
        if(K<=tika){
            res = Math.abs(X) - D*K;
        }else if((K-tika)%2==0){
            res = Math.abs(X) - D*tika;
        }else{
            res = D*(tika+1) - Math.abs(X);
        }
		System.out.println(res);
	}
}