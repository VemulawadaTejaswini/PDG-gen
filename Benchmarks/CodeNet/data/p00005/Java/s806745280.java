

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		while((line=sc.nextLine())!=null&&!(line.trim().equals(""))) {
			String[] temp = line.split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int gcd = commonDiv(a,b);
			System.out.println(gcd+" "+(a*(b/gcd)));
		}
		
	}

	

	public static int commonDiv(int a, int b) {
		if(b==0) return a;
		else return commonDiv(b, a%b);
	}

}

