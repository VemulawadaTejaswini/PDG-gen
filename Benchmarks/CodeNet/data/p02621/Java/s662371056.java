package ps;

import java.util.Scanner;

public class Problem_Solving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	double a;
	a=input.nextInt();
	double tot=0;
	for (int i=1;i<=3;i++) {
		tot= tot+Math.pow(a,i);
	}
	System.out.println(tot);
	}

}
