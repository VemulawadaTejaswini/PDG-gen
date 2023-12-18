

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum;
		for(int i = 0;i < 5;++i){
			sum = sc.nextInt();
			if(sum == 0) break;
			for(int j = 0;j < 9;++j){
				sum -= sc.nextInt();
			}
			System.out.println(sum);
		}
	}
}