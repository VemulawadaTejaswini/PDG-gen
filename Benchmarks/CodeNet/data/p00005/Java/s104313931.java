import java.math.BigInteger;
import java.util.Scanner;


public class Main{
	public static void main(String args[]){
		new Main().run();
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		String a;
		while(true){
			if(!sc.hasNext()){
				break;
			}
			a = sc.next();
			BigInteger bi1 = new BigInteger(a);
			BigInteger bi12 = bi1;
			a = sc.next();
			BigInteger bi2 = new BigInteger(a);
			BigInteger bi22 = bi2;
			switch(bi1.compareTo(bi2)){
			case 1:
				//テ・ツシツ陛ヲツ閉ーテ」ツつ暗」ツつ甘・ツ、ツァテ」ツ?催」ツ??
				bi1 = solve(bi1,bi2);
				break;
			case 0:
				//テ・ツシツ陛ヲツ閉ーテ」ツ?ィテ・ツ青古」ツ??
				break;
			case -1:
				bi1 = solve(bi2,bi1);
				break;
			}
			System.out.println(bi1+" "+bi12.multiply(bi22).divide(bi1));
		}
	}

	BigInteger solve(BigInteger bi1, BigInteger bi2){
		if(!bi1.remainder(bi2).equals(new BigInteger("0"))){
			bi1 = bi1.remainder(bi2);
			return solve(bi2,bi1);
		}
		return bi2;
	}
}