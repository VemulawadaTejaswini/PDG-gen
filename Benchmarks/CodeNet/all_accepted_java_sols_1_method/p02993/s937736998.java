

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String h = sc.next();
		int flag =0;
		for(int i=0;i<h.length()-1;i++) {
			if(h.charAt(i)==h.charAt(i+1)) {
				flag =1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}

	}

}
