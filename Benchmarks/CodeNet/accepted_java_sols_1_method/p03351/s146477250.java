import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int range = scan.nextInt();
		

		final String NO = "No";
		final String YES = "Yes";
		String com = NO;

		if(Math.abs(a - c) <= range){	
			com = YES;
		}

		if(Math.abs(a - b) <= range &&
		   Math.abs(b - c) <= range){
			com = YES;
		}

		System.out.println(com);
	}
}	