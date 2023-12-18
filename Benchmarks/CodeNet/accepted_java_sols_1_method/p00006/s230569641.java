import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] rev = str.toCharArray();
		for(int i = rev.length - 1; i >= 0; i--){
			System.out.print(rev[i]);
		}
		System.out.println();
	}
}