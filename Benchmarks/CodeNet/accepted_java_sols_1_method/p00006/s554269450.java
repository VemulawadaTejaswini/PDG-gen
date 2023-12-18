import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char charStr[] = str.toCharArray();
		for(int i=charStr.length-1; i>=0; i--){
			System.out.print(charStr[i]);
		}
		System.out.println();
	}
} 