package Digit_Number;

import java.util.*;
class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum;
		int cnt = 1;
		int value;
		while(cnt <= 200 || true){
			if(a < 0 || b < 0){
				break;
			}
			sum = 0;
			value = 0;
			sum = a+b;
			while(sum > 0){
				sum = sum /10;
				value++; 
			}
			System.out.println(value);
			cnt++;
			a = scan.nextInt();
			b = scan.nextInt();
		}

	}

}