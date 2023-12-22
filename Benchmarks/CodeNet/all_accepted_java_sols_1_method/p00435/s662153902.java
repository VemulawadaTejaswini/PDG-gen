import java.util.Scanner;


public class Main {
	static String[] a = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] b = new String[] {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String tmp = stdIn.next();
		for(int i = 0;i < tmp.length(); i++) {
			for(int j = 0; j < a.length; j++) {
				if(tmp.charAt(i) == b[j].charAt(0)) {
					System.out.print(a[j]);
					break;
				}
			}
		}
		System.out.println();
	}
	
}