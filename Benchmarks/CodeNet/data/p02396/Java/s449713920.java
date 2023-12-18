package jp.co.ws.training.study01;

import java.util.Scanner;

public class Training01_04 {

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		int i = 1;
		
		while(true){
			int x = text.nextInt();
			if(x == 0){
				break;
			}else{
				System.out.println("Case"+" "+i+":"+" "+x);
				i= i + 1;
			}
		}
	}

}