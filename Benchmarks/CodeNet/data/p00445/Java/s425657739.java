import java.util.Scanner;


public class Main {
	static String[] a = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] b = new String[] {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while (stdIn.hasNext()) {
			String tmp = stdIn.next();
			tmp = tmp.toLowerCase();
			int j = sorvj(tmp);
			int i = sorvi(tmp);
			System.out.println(j);
			System.out.println(i);
		}
	}
	
	static int sorvj(String a) {
		int ans = 0;
		for(int i = 0; i < a.length() - 2; i++) {
			IN:for(int j = 0; j < 3; j++) {
				switch(j) {
				case 0: if(a.charAt(i) != 'j') break IN; break;
				case 1: if(a.charAt(i + 1) != 'o') break IN; break;
				case 2: if(a.charAt(i + 2) == 'i') ans++; break;
				}
			}
		}
		return ans;
	}
	
	static int sorvi(String a) {
		int ans = 0;
		for(int i = 0; i < a.length() - 2; i++) {
			IN:for(int j = 0; j < 3; j++) {
				switch(j) {
				case 0: if(a.charAt(i) != 'i') break IN; break;
				case 1: if(a.charAt(i + 1) != 'o') break IN; break;
				case 2: if(a.charAt(i + 2) == 'i') ans++; break;
				}
			}
		}
		return ans;
		
	}
	
}