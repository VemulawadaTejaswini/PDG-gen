import java.math.BigInteger;//n進数に治すメソッド
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			BigInteger b = sc.nextBigInteger();
			if(b.intValue()==-1)break;
			System.out.println(b.toString(4));//4進数
		}
	}
}