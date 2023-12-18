import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		BigInteger kaizyou = new BigInteger("1");
		while(n != 0){
			for(long i = 1 ; i <= n ; i++){
				kaizyou= kaizyou.multiply(BigInteger.valueOf(i));
			}
			String bun = kaizyou.toString();
			int cun = 0;
			while(bun.length() != 0){
				if(bun.endsWith("0")){
					++cun;
					bun = bun.substring(0, bun.length()-1);
				}else{
					break;
				}
			}
			System.out.println(cun);
			n = scan.nextInt();
		}
	}
}