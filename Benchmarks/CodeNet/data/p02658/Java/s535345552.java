import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger ret = new BigInteger(sc.next());
		BigInteger hoge = new BigInteger("1000000000000000000");
		for(int i = 0; i < N - 1; i++){
			ret = ret.multiply(new BigInteger(sc.next()));
		}
		if(ret.compareTo(hoge) > 0){
			System.out.print(-1);
			return;
		}
		System.out.print(ret);
	}
}

