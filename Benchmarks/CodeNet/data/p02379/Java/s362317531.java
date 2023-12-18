

import java.util.Scanner;

public class Math {

	public static void main(String[] args){
		//
		Scanner sc = new Scanner(System.in);
		
		//最初の座標
		int firstX = sc.nextInt();
		int firstY = sc.nextInt();
		
		//二つ目の座標
		int secondX = sc.nextInt();
		int secondY = sc.nextInt();
		
		//二つの座標の距離
		double answer;
		answer = Math.sqrt(((secondX-firstX)*(secondX-firstX))+((secondY-firstY)*(secondY-firstY)));

		System.out.println(answer);
	}
}