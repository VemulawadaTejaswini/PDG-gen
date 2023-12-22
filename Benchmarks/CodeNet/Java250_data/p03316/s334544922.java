import java.util.Scanner;

public class Main {

	/*
	 * 問題文 整数  n  に対して， n  
	 * を十進法で表したときの各桁の和を  
	 * S ( n )  で表すことにします． 
	 * たとえば， S ( 101 ) = 1 + 0 + 1 = 2  です．  
	 * 整数Nが与えられたとき， N  が  S ( N )  
	 * で割り切れるかどうかを判定してください．
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp = input;
		int digitSum = 0;
		while(temp != 0) {
			digitSum += temp%10;
			temp /= 10;
		}
		if(input%digitSum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}