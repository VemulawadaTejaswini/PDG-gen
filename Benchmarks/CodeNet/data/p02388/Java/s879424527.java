package exe;

import java.util.Scanner;

public class XCubic {

	public static void main(String[] args) {
		int ans=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int x = s.nextInt();
		if(x>=1 && x<=100){
			ans=x*x*x;
			System.out.println("Answer of  cubic "+ans);
		}else{
			System.out.println("Number is invalid");
		}
		
	

	}

}