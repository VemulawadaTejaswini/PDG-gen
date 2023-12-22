import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if ( a < b ) {
				System.out.println(buildStr(a,b));
			}
			else {
				System.out.println(buildStr(b,a));
			}

		}
	}
	
	private static String buildStr(int base, int times) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < times ; i++ ) {
			sb.append(String.valueOf(base));
		}
		
		return sb.toString();
		
	}
}