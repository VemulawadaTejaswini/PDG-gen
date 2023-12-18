import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(true){
			long numA = stdIn.nextLong();
			long numB = stdIn.nextLong();
			long GCD = getGCD(numA,numB);
			long LCM = getLCM(numA,numB);
			System.out.println(GCD + " " + LCM);
		}
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最大公約数(GCD)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getGCD(long numA,long numB){
		long GCD = 1L;
		if(numA == numB && !(numA == 0 && numB == 0)){
			GCD = numA;
		}else{
			if(numA > numB){
				long temp= numA;
				numA = numB;
				numB = temp;
			}
			long bigNum = numB;

			while(0 < bigNum){
				if(numA % bigNum == 0 && numB % bigNum == 0){
					GCD = bigNum;
					break;
				}
				bigNum--;
			}
		}
		return GCD;
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最小公倍数(LCM)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getLCM(long numA,long numB){
		long LCM = 0L;
		if(numA == numB && !(numA == 0 && numB == 0)){
			LCM = numA;
		}else{
			if(numA > numB){
				long temp= numA;
				numA = numB;
				numB = temp;
			}
			while(LCM < 2000000000){
				LCM += numB;
				if(LCM % numA == 0){
					break;
				}
			}
		}
		return LCM;
	}
}