import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		String str, ans = "";
		int m;
		int s;
		int l;
		while (true){
			str = scan.next();
			if (str.equals("-")) break;
			l = str.length();
			m = scan.nextInt();

			
			for (int i = 0; i < m; i++){
				s = scan.nextInt();
				str = str.substring(s, l) + str.substring(0, s);
			}
			System.out.println(str);
		}
		
	}
}