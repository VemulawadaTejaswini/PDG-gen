import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			long numA = stdIn.nextLong();
			long numB = stdIn.nextLong();
			long GCD = getGCD(numA,numB);				//最大公約数
			long LCM = getLCM(numA,numB);				//最小公倍数
			System.out.println(GCD + " " + LCM);
		}
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最大公約数(GCD)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getGCD(long numA,long numB){
		//以下、ユークリッドの互除法
		if(numA > numB){
			long temp = numA;
			numA = numB;
			numB = temp;
		}
		long r;
		while(0 != numB){
			r = numA % numB;
			numA = numB;
			numB = r;
		}
		long GCD = numA;

		return GCD;
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最小公倍数(LCM)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getLCM(long numA,long numB){
		long LCM = 0L;
		LCM = numA / getGCD(numA,numB) * numB;
		return LCM;
	}
}